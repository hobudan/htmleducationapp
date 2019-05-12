package com.huseyinobudan.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private CardView giriscard;
    private CardView temel_etiketCard;
    private CardView metinCard;
    private CardView tabloCard;
    private CardView listeCard;
    private CardView form1Card;
    private CardView form2Card;
    private CardView linkCard;
    private CardView sesCard;
    private CardView videoCard;
    private CardView infoCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giriscard = (CardView) findViewById(R.id.giris);
        temel_etiketCard = (CardView) findViewById(R.id.temel_etiket);
        metinCard = (CardView) findViewById(R.id.metin);
        tabloCard = (CardView) findViewById(R.id.tablo);
        listeCard = (CardView) findViewById(R.id.liste);
        form1Card = (CardView) findViewById(R.id.form1);
        form2Card = (CardView) findViewById(R.id.form2);
        linkCard = (CardView) findViewById(R.id.link);
        sesCard = (CardView) findViewById(R.id.ses);
        videoCard = (CardView) findViewById(R.id.video);
        infoCard = (CardView) findViewById(R.id.info);

        // add click listener to the cards

        giriscard.setOnClickListener(this);
        temel_etiketCard.setOnClickListener(this);
        metinCard.setOnClickListener(this);
        tabloCard.setOnClickListener(this);
        listeCard.setOnClickListener(this);
        form1Card.setOnClickListener(this);
        form2Card.setOnClickListener(this);
        linkCard.setOnClickListener(this);
        sesCard.setOnClickListener(this);
        videoCard.setOnClickListener(this);
        infoCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.giris:i=new Intent(this,Giris.class);startActivity(i);break;
            case R.id.temel_etiket:i=new Intent(this,Temel_Etiket.class);startActivity(i);break;
            case R.id.metin:i=new Intent(this,Metin.class);startActivity(i);break;
            case R.id.tablo:i=new Intent(this,Tablo.class);startActivity(i);break;
            case R.id.liste:i=new Intent(this,Liste.class);startActivity(i);break;
            case R.id.form1:i=new Intent(this,Form1.class);startActivity(i);break;
            case R.id.form2:i=new Intent(this,Form2.class);startActivity(i);break;
            case R.id.link:i=new Intent(this,Link.class);startActivity(i);break;
            case R.id.ses:i=new Intent(this,Ses.class);startActivity(i);break;
            case R.id.video:i=new Intent(this,Video.class);startActivity(i);break;
            case R.id.info:i=new Intent(this,Info.class);startActivity(i);break;
            default:break;
        }

    }
}
