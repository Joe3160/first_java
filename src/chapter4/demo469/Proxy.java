package chapter4.demo469;

public class Proxy implements Network {
    private Network network;

    public Proxy(Network network) {
        this.network = network;
    }

    public void check() {
        System.out.println("检查是否合法");
    }

    @Override
    public void browse() {
        this.check();
        this.network.browse();
    }
}
