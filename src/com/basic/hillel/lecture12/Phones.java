package com.basic.hillel.lecture12;

/**
 * Created by alpa on 11/28/19
 */
public enum Phones {

    IPHONE("11 ProMax", "Apple", Producer.APPLE),
    SAMSUNG("Galaxy s10", "Samsung", Producer.APPLE),
    XIAOMI("RedME note 10", "Xiaomi", Producer.APPLE),
    OPPO("K3", "Oppo", Producer.APPLE);

    private String model;
    private String producer;
    private Producer producer1;

    Phones(String model, String producer, Producer producer1) {
        this.model = model;
        this.producer = producer;
        this.producer1 = producer1;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public Producer getProducer1() {
        return producer1;
    }
}
