package main.java.com.igeek.pojo;

import java.sql.Timestamp;

public class Items {

    private Integer id;
    private String name;
    private Double price;
    private String detail;
    private Timestamp createtime;
    private String pic;

    public Items() {
    }

    public Items(Integer id, String name, Double price, String detail, Timestamp createtime, String pic) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.createtime = createtime;
        this.pic = pic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", createtime=" + createtime +
                ", pic='" + pic + '\'' +
                '}';
    }
}
