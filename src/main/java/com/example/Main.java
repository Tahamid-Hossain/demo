package com.example;

import com.microsoft.playwright.*;

public class Main {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
      BrowserType browserType = playwright.chromium();
      Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
      Page page = browser.newPage();
      page.navigate("https://www.noon.com/");
      System.out.println(page.title());
      browser.close();
    }
    }
}
