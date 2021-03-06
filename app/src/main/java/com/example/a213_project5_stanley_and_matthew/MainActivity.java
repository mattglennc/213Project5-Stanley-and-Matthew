package com.example.a213_project5_stanley_and_matthew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
/**
 * This MainActivity class holds StoreOrders and Order and acts as a way to interact with it between the other activities, and
 * provides functionality for the activity_main.xml of the RU CAFE.  Private helper methods are included.
 * onCreate() creates the StoreOrders and Order and starts its operation.
 *
 * @author Matthew Carrascoso & Stanley Chou
 */

public class MainActivity extends AppCompatActivity {

    private ImageButton donutButton, coffeeButton, orderButton,storeButton;
    public static StoreOrders orders;
    public static Order currentOrder;

    /**
     * Get the references of all instances of Views defined in the layout file, initializes the orders
     * and current Order. Sets up the layout for the applications main menu.
     *
     * @param savedInstanceState saved state information of the model
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        donutButton = findViewById(R.id.donutButton);
        coffeeButton = findViewById(R.id.coffeeButton);
        orderButton = findViewById(R.id.orderButton);
        storeButton = findViewById(R.id.storeButton);
        this.orders = new StoreOrders();
        this.currentOrder = new Order();
    }

    /**
     * Event listener that opens the donut view when image is clicked.
     * @param view View which is currently being accessed.
     */
    public void donutActivity(View view){
        Intent donutIntent = new Intent(this, OrderDonuts.class);
        startActivity(donutIntent);
    }

    /**
     * Event listener that opens the coffee view when image is clicked.
     * @param view View which is currently being accessed.
     */
    public void coffeeActivity(View view){
        Intent coffeeIntent = new Intent(this, OrderCoffee.class);
        startActivity(coffeeIntent);
    }

    /**
     * Event listener that opens the order view when image is clicked.
     * @param view View which is currently being accessed.
     */
    public void orderActivity(View view){
        Intent orderIntent = new Intent(this, CurrentOrder.class);
        startActivity(orderIntent);
    }

    /**
     * Event listener that opens the store orders view when image is clicked.
     * @param view View which is currently being accessed.
     */
    public void storeActivity(View view){
        Intent storeIntent = new Intent(this, OrdersList.class);
        startActivity(storeIntent);
    }
}