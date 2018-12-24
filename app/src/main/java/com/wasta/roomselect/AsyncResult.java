package com.wasta.roomselect;

import java.util.List;

public interface AsyncResult {
    void asyncFinished(List<Product> results);
}