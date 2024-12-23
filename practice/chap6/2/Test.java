class Base {
  public void methodA() {
    System.out.println("Base#methodA()");
  }

  public void methodB() {
    System.out.println("Base#methodB()");
  }
}

class Test extends Base {
  @Override
  public void methodA() {
    super.methodA(); // オーバーライド元のメソッドにアクセス
    methodB(); // オーバーライドと関係の無いスーパークラスのメソッドにアクセス
  }

  public static void main(String[] args) {
    new Test().methodA();
  }
}
