package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.net.URLEncoder;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void Beli01(View view) {
        String phoneNumber = "+6285841907411"; // Ganti dengan nomor tujuan
        String productName = "Baju Polos"; // Nama produk
        String price = "RP.35.000,00"; // Harga produk

        String message = "Nama produk: " + productName + "\nHarga: " + price;

        try {
            PackageManager packageManager = getPackageManager();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message, "UTF-8");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(url));
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Aplikasi WhatsApp tidak terpasang di perangkat Anda", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void Beli02(View view) {
        String phoneNumber = "+6282179707300"; // Ganti dengan nomor tujuan
        String productName = "Hoodie Polos"; // Nama produk
        String price = "RP.100.000,00"; // Harga produk

        String message = "Nama produk: " + productName + "\nHarga: " + price;

        try {
            PackageManager packageManager = getPackageManager();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message, "UTF-8");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(url));
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Aplikasi WhatsApp tidak terpasang di perangkat Anda", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void Beli03(View view) {
        String phoneNumber = "+6282179707300"; // Ganti dengan nomor tujuan
        String productName = "Kemeja Polos"; // Nama produk
        String price = "RP.120.000,00"; // Harga produk

        String message = "Nama produk: " + productName + "\nHarga: " + price;

        try {
            PackageManager packageManager = getPackageManager();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message, "UTF-8");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(url));
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Aplikasi WhatsApp tidak terpasang di perangkat Anda", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Beli04(View view) {
        String phoneNumber = "+6282179707300"; // Ganti dengan nomor tujuan
        String productName = "Baju CLoteh"; // Nama produk
        String price = "RP.50.000.000,00"; // Harga produk

        String message = "Nama produk: " + productName + "\nHarga: " + price;

        try {
            PackageManager packageManager = getPackageManager();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message, "UTF-8");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(url));
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Aplikasi WhatsApp tidak terpasang di perangkat Anda", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void Beli05(View view) {
        String phoneNumber = "+6282179707300"; // Ganti dengan nomor tujuan
        String productName = "Baju CLoteh"; // Nama produk
        String price = "RP.50.000.000,00"; // Harga produk

        String message = "Nama produk: " + productName + "\nHarga: " + price;

        try {
            PackageManager packageManager = getPackageManager();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message, "UTF-8");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(url));
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Aplikasi WhatsApp tidak terpasang di perangkat Anda", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void Beli06(View view) {
        String phoneNumber = "+6282179707300"; // Ganti dengan nomor tujuan
        String productName = "Baju CLoteh"; // Nama produk
        String price = "RP.50.000.000,00"; // Harga produk

        String message = "Nama produk: " + productName + "\nHarga: " + price;

        try {
            PackageManager packageManager = getPackageManager();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message, "UTF-8");
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(url));
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Aplikasi WhatsApp tidak terpasang di perangkat Anda", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}