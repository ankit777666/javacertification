package com.ankit777666.javacertification.chapter1.problem5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import com.ankit777666.javacertification.chapter1.problem5.ShoppingCart;;

public class Cashier {
  private final String filename;
  private final String path;
  private BufferedWriter writer;

  public Cashier(String filename, String path) {
    this.filename = filename;
    this.path = path;
  }

  @PostConstruct
  public void openFile() throws IOException {
    var checkoutpath = Path.of(path, filename + ".txt");
    if (Files.notExists(checkoutpath.getParent())) {
      Files.createDirectories(checkoutpath.getParent());
    }
    this.writer = Files.newBufferedWriter(checkoutpath, StandardCharsets.UTF_8,
        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
  }

  public void checkout(ShoppingCart cart) throws IOException {
    writer.write(LocalDateTime.now() + "\t" + cart.getItems() + "\r\n");
    writer.flush();
  }

  @PreDestroy
  public void closeFile() throws IOException {
    writer.close();
  }

}
