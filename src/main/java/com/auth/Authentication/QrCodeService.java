package com.auth.Authentication;

public interface QrCodeService {
    byte[] generateQrCode(String qrCodeContent, int width, int height);
}
