package com.example.foodsapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Nasi Goreng", "Nasi Goreng spesial yang gurih dan juga mengenyangkan dengan toping tambahan sosis, acar, telur, dan berbagai bumbu rempah lainya", 15000, context.getDrawable(R.drawable.nasigoreng),R.drawable.nasigoreng));
        list.add(new Food("Mie Goreng", "Mie Goreng spesial yang lembut tingkat kematangan yang sempurna serta bahan dasar mie yang tidak menggunakan pengawet yang membuat mie ini sehat", 15000, context.getDrawable(R.drawable.mie_goreng),R.drawable.mie_goreng));
        list.add(new Food("Batagor", "Batagor Spesial Bandung. dibuat langsung menggunakan bahan dasar ikan tenggiri yang masih fresh. serta balutan bumbu kacang yang kental membuat batagor bandung ini semakin lezat untuk dinikmati", 10000, context.getDrawable(R.drawable.batagor),R.drawable.batagor));
        list.add(new Food("Black Salad", "Balck Salad. Dibuat menggunakan bahan yang berkualitas membuat black salad ini cocok untuk dijadikan sebagai makanan pokok yang sehat bagi anda", 10000, context.getDrawable(R.drawable.black_salad),R.drawable.black_salad));
        list.add(new Food("Caphuchino", "Capuhcino. yang dapat disajikan baik hangat ataupun dingin. dibuat untuk memenuhi mood baik anda", 12000, context.getDrawable(R.drawable.cappuchino),R.drawable.cappuchino));
        list.add(new Food("Cheesecake", "Cheesecake yang lembut. dibuat khusus bagi konsumen yang lembut pula. dapat dinikmati ketika sedang bersantai setelah seharian bekerja.", 13000, context.getDrawable(R.drawable.cheesecake),R.drawable.cheesecake));
        list.add(new Food("Sparkling Tea", "Sparkling Tea dingin adalah minuman yang cocok dikala hari sedang oanas panasnya. ditambah soda yang dapat menyegarkan tenggorokan anda", 8000, context.getDrawable(R.drawable.sparkling_tea),R.drawable.sparkling_tea));
        list.add(new Food("Donut", "Donut yang lembut juga flumpy sangat pas dinikmati sebagai hidangan penutup rasanay yang manis dapat membuat mood baik anda naik.", 5000, context.getDrawable(R.drawable.donut),R.drawable.donut));
        return list;
    }

    public static void tambahData(Context context){
        Database database = new Database(context);
        ArrayList<Food> foods =getData(context);

        for (Food product: foods){
            database.InsertData(product);
        }

    }
}
