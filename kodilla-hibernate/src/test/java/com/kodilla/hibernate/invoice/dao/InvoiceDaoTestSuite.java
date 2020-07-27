package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product bicycle = new Product("bicycle");
        Product helmet = new Product("helmet");
        Invoice invoice = new Invoice("27/07/2020");
        Item ibicycle = new Item(bicycle, new BigDecimal(7500), 1);
        Item ihelmet = new Item(helmet, new BigDecimal(900), 1);

        ibicycle.setInvoice(invoice);
        ihelmet.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(ibicycle);
        items.add(ihelmet);

        //When
        invoiceDao.save(invoice);
        int yourInvoice = invoice.getId();

        //Then
        Assert.assertNotEquals(0, yourInvoice);

        //CleanUp
        invoiceDao.deleteById(yourInvoice);
    }
}
