package de.bankprogramming.wrappers;

import de.bankprogramming.models.Product;
import de.bankprogramming.models.enums.ProductType;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;

/**
 * Created by Czichotzki on 29.05.2017.
 */
public class ProductWrapper implements Wrapper<Product> {

    private Product original;

    private LongProperty productID;
    private ObjectProperty<LocalDate> startDate;
    private ObjectProperty<LocalDate> endDate;
    private ObjectProperty<ProductType> type;
    private LongProperty customerID;

    public ProductWrapper(Product original) {
        this.original = original;
        productID = new SimpleLongProperty();
        startDate = new SimpleObjectProperty<>();
        endDate = new SimpleObjectProperty<>();
        type = new SimpleObjectProperty<>();
        customerID = new SimpleLongProperty();
    }

    @Override
    public Product getOriginal() {
        return original;
    }

    @Override
    public void updateValues() {
        productID.set(original.getProductID());
        startDate.set(original.getStartDate());
        endDate.set(original.getEndDate());
        type.set(original.getType());
        customerID.set(original.getCustomerID());
    }

    public long getProductID() {
        return productID.get();
    }

    public LongProperty productIDProperty() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID.set(productID);
    }

    public LocalDate getStartDate() {
        return startDate.get();
    }

    public ObjectProperty<LocalDate> startDateProperty() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate.set(startDate);
    }

    public LocalDate getEndDate() {
        return endDate.get();
    }

    public ObjectProperty<LocalDate> endDateProperty() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate.set(endDate);
    }

    public ProductType getType() {
        return type.get();
    }

    public ObjectProperty<ProductType> typeProperty() {
        return type;
    }

    public void setType(ProductType type) {
        this.type.set(type);
    }

    public long getCustomerID() {
        return customerID.get();
    }

    public LongProperty customerIDProperty() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID.set(customerID);
    }
}