package com;

// Main.javaとは異なるパッケージにもかかわらず、publicがついていないためコンパイルエラー
class Item {
    String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
