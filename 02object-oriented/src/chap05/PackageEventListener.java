package chap05;

public class PackageEventListener implements EventListener {
    @Override
    public void onclick() {
        System.out.println("展开包中文件");
    }
    @Override
    public void onkeydown(String key) {
        System.out.println("onkeydown");
    }

    @Override
    public void onchange() {
        System.out.println("包中文件发生改变");
    }

}

