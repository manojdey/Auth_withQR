package com.auth.Authentication;

import java.util.Date;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "QRCode controller exposes GenereateQRcode ,GenereateQRcodewithPdf  and   REST APIs")
@RestController
@RequestMapping("/api/v1")
public class QRController {
	@Value("${app.url}")
	private String applicationUrl;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;

	@Autowired
	private QrCodeService qrCodeService;

	@ApiOperation(value = "Create QR REST API")
	@PostMapping("/qr-code/{contentToGenerateQrCode}")
	public ResponseEntity<byte[]> createQRcode(@PathVariable String contentToGenerateQrCode) {
		System.out.println(contentToGenerateQrCode + "-----------------------" + applicationUrl);
		return null;
	}

	@RequestMapping(value = "/generate-qr-code-with-url/{contentToGenerateQrCode}", method = RequestMethod.GET)
	public ResponseEntity<byte[]> getQrCodeValidated(@PathVariable String contentToGenerateQrCode) {
		System.out.println(applicationUrl + "------getQrCodeValidated-----" + contentToGenerateQrCode);
		byte[] qrCode = qrCodeService.generateQrCode(applicationUrl + contentToGenerateQrCode, WIDTH, HEIGHT);
		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(qrCode);
	}

	/*
	 * @ResponseBody
	 * 
	 * @PostMapping("/getqrcode") public ResponseEntity<byte[]>
	 * getQRCodeByBodyParam(@RequestBody RequestFormat rf) {
	 * //www.foobar.com/?first=1&second=12&third=5 String data =
	 * rf.getAapUrl()+"?encrValue="+rf.getTokenCode()+"&"+rf.getQrCodeString();
	 * System.out.println(rf.getAapUrl()); System.out.println(rf.getQrCodeString());
	 * System.out.println(rf.getTokenCode()); byte[] qrCode =
	 * qrCodeService.generateQrCode(data, WIDTH, HEIGHT); return
	 * ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(qrCode); }
	 */

	
	
	
	
	@ResponseBody
	@PostMapping("/getqrcode")
	public ResponseEntity<String> getQRCodeByBodyParam(@RequestBody RequestFormat rf) {
	    try {
	        // Build data string for QR code
	        String data = rf.getAapUrl() + "?encrValue=" + rf.getTokenCode() + "&" + rf.getQrCodeString();

	        // Generate QR code as byte array
	        byte[] qrCode = qrCodeService.generateQrCode(data, WIDTH, HEIGHT);

	        // Save QR code into current directory
	        String fileName = "qrcode_" + System.currentTimeMillis() + ".png";
	        Path path = Paths.get(fileName);
	        Files.write(path, qrCode);

	        System.out.println("QR Code generated and saved as: " + fileName);

	        // Return success message
	        return ResponseEntity.ok("Success");

	    } catch (Exception e) {
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("Failure: Unable to generate QR Code");
	    }
	}
}
