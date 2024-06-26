package com.ankit777666.javacertification.chapter1.problem4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.core.io.Resource;

public class BannerLoader {
  private final Resource banner;

  public BannerLoader(Resource banner) {
    this.banner = banner;
  }

  public void showBanner() throws IOException {
    var path = Path.of(banner.getURI());
    try (var lines = Files.lines(path, StandardCharsets.UTF_8)) {
      lines.forEachOrdered(System.out::println);
    }
  }

}
