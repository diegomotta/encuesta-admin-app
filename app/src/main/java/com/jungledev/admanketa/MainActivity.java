package com.jungledev.admanketa;

import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    HashMap<String,Integer> valores_pregunta1 = new HashMap<>();
    HashMap<String,Integer> valores_pregunta2 = new HashMap<>();
    HashMap<String,Integer> valores_pregunta3 = new HashMap<>();
    HashMap<String,Integer> valores_pregunta4 = new HashMap<>();
    List<String> valores_pregunta5 = new ArrayList<>();
    HashMap<String,Integer> valores_pregunta6 = new HashMap<>();
    HashMap<String,Integer> valores_pregunta7 = new HashMap<>();

    List<String> valores_pregunta8 = new ArrayList<>();
    HashMap<String,Integer> valores_pregunta9 = new HashMap<>();
    List<String> valores_pregunta10 = new ArrayList<>();
    HashMap<String, Integer> valores_pregunta11  =new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnActualizar = (Button) findViewById(R.id.btnActualizar);
        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStart();

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        getPregunta_1();
        getPregunta_2();
        getPregunta_3();
        getPregunta_4();
        getPregunta_5();
        getPregunta_6();
        getPregunta_7();
        getPregunta_8();
        getPregunta_9();
        getPregunta_10();
        getPregunta_11();
    }

    public void getPregunta_1(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_1").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_excelente = 0;
                        Integer cant_muy_bueno = 0;
                        Integer cant_bueno = 0;
                        Integer cant_regular = 0;
                        Integer cant_malo = 0;
                        Integer total_preguntas = 0;
                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String id = (String) (messageSnapshot.getKey());
                            String calificacion = (String) messageSnapshot.child("calificacion").getValue();
                            switch (calificacion) {
                                case ("EXCELENTE"):
                                    cant_excelente++;
                                    break;
                                case ("MUY_BUENO"):
                                    cant_muy_bueno++;
                                    break;
                                case ("BUENO"):
                                    cant_bueno++;
                                    break;
                                case ("REGULAR"):
                                    cant_regular++;
                                    break;
                                case ("MALO"):
                                    cant_malo++;
                                    break;
                            }

                        }
                        valores_pregunta1.put("TOTAL", ((Long) dataSnapshot.getChildrenCount()).intValue());
                        valores_pregunta1.put("EXCELENTE", cant_excelente);
                        valores_pregunta1.put("MUY_BUENO", cant_muy_bueno);
                        valores_pregunta1.put("BUENO", cant_bueno);
                        valores_pregunta1.put("REGULAR", cant_regular);
                        valores_pregunta1.put("MALO", cant_malo);
                        updateValoresPregunta1();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }


    public void getPregunta_2(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_2").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_excelente = 0;
                        Integer cant_muy_bueno = 0;
                        Integer cant_bueno = 0;
                        Integer cant_regular = 0;
                        Integer cant_malo = 0;
                        Integer total_preguntas = 0;
                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String id = (String) (messageSnapshot.getKey());
                            String calificacion = (String) messageSnapshot.child("calificacion").getValue();
                            switch (calificacion) {
                                case ("EXCELENTE"):
                                    cant_excelente++;
                                    break;
                                case ("MUY_BUENO"):
                                    cant_muy_bueno++;
                                    break;
                                case ("BUENO"):
                                    cant_bueno++;
                                    break;
                                case ("REGULAR"):
                                    cant_regular++;
                                    break;
                                case ("MALO"):
                                    cant_malo++;
                                    break;
                            }

                        }
                        valores_pregunta2.put("TOTAL", ((Long) dataSnapshot.getChildrenCount()).intValue());
                        valores_pregunta2.put("EXCELENTE", cant_excelente);
                        valores_pregunta2.put("MUY_BUENO", cant_muy_bueno);
                        valores_pregunta2.put("BUENO", cant_bueno);
                        valores_pregunta2.put("REGULAR", cant_regular);
                        valores_pregunta2.put("MALO", cant_malo);
                        updateValoresPregunta2();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }


    public void getPregunta_3(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_3").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_excelente= 0;
                        Integer cant_muy_bueno=0;
                        Integer cant_bueno=0;
                        Integer cant_regular = 0;
                        Integer cant_malo = 0;
                        Integer total_preguntas= 0;
                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String id = (String) (messageSnapshot.getKey());
                            String calificacion = (String) messageSnapshot.child("calificacion").getValue();
                            switch (calificacion){
                                case ("EXCELENTE"):
                                    cant_excelente++;
                                    break;
                                case("MUY_BUENO"):
                                    cant_muy_bueno++;
                                    break;
                                case ("BUENO"):
                                    cant_bueno++;
                                    break;
                                case ("REGULAR"):
                                    cant_regular++;
                                    break;
                                case("MALO"):
                                    cant_malo++;
                                    break;
                            }

                        }
                        valores_pregunta3.put("TOTAL", ((Long)dataSnapshot.getChildrenCount()).intValue());
                        valores_pregunta3.put("EXCELENTE", cant_excelente);
                        valores_pregunta3.put("MUY_BUENO", cant_muy_bueno);
                        valores_pregunta3.put("BUENO", cant_bueno);
                        valores_pregunta3.put("REGULAR", cant_regular);
                        valores_pregunta3.put("MALO", cant_malo);
                        updateValoresPregunta3();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void getPregunta_4(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_4").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_excelente = 0;
                        Integer cant_muy_bueno = 0;
                        Integer cant_bueno = 0;
                        Integer cant_regular = 0;
                        Integer cant_malo = 0;
                        Integer total_preguntas = 0;
                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String id = (String) (messageSnapshot.getKey());
                            String calificacion = (String) messageSnapshot.child("calificacion").getValue();
                            switch (calificacion) {
                                case ("EXCELENTE"):
                                    cant_excelente++;
                                    break;
                                case ("MUY_BUENO"):
                                    cant_muy_bueno++;
                                    break;
                                case ("BUENO"):
                                    cant_bueno++;
                                    break;
                                case ("REGULAR"):
                                    cant_regular++;
                                    break;
                                case ("MALO"):
                                    cant_malo++;
                                    break;
                            }

                        }
                        valores_pregunta4.put("TOTAL", ((Long) dataSnapshot.getChildrenCount()).intValue());
                        valores_pregunta4.put("EXCELENTE", cant_excelente);
                        valores_pregunta4.put("MUY_BUENO", cant_muy_bueno);
                        valores_pregunta4.put("BUENO", cant_bueno);
                        valores_pregunta4.put("REGULAR", cant_regular);
                        valores_pregunta4.put("MALO", cant_malo);
                        updateValoresPregunta4();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void getPregunta_5(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_5").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String id = (String) (messageSnapshot.getKey());
                            String respuesta = (String) messageSnapshot.child("respuesta").getValue();
                            System.out.println(respuesta);
                            valores_pregunta5.add(respuesta);

                        }
                        updateValoresPregunta5();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void getPregunta_6(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_6").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_si = 0;
                        Integer cant_no = 0;

                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String id = (String) (messageSnapshot.getKey());
                            String calificacion = (String) messageSnapshot.child("respuesta").getValue();
                            switch (calificacion) {
                                case ("Si"):
                                    cant_si++;
                                    break;
                                case ("No"):
                                    cant_no++;
                                    break;
                            }

                        }
                        valores_pregunta6.put("TOTAL", ((Long) dataSnapshot.getChildrenCount()).intValue());
                        valores_pregunta6.put("CANT_SI", cant_si);
                        valores_pregunta6.put("CANT_NO", cant_no);

                        updateValoresPregunta6();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }


    public void getPregunta_7(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_7").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_1 = 0;
                        Integer cant_2 = 0;
                        Integer cant_3 = 0;
                        Integer cant_4 = 0;
                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                           for (DataSnapshot messageSnapshot1 : messageSnapshot.getChildren()){
                               String valor = (String) messageSnapshot1.child("opcion").getValue();
                                switch (valor){
                                    case "Bondiola de cerdo":
                                        cant_1++;
                                        break;
                                    case "Cuadril":
                                        cant_2++;
                                        break;
                                    case "Suprema de pollo":
                                        cant_3++;
                                        break;
                                    case "Combinado":
                                        cant_4++;
                                        break;
                                }

                           }
                        }
                        valores_pregunta7.put("TOTAL", ((Long) dataSnapshot.getChildrenCount()).intValue());
                        valores_pregunta7.put("Bondiola de cerdo",cant_1);
                        valores_pregunta7.put("Cuadril",cant_2);
                        valores_pregunta7.put("Suprema de pollo",cant_3);
                        valores_pregunta7.put("Combinado",cant_4);
                        updateValoresPregunta7();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void getPregunta_8(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_8").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String valor = (String) messageSnapshot.child("respuesta").getValue();
                            valores_pregunta8.add(valor);
                        }
                        updateValoresPregunta8();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void getPregunta_9(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_9").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_1 = 0;
                        Integer cant_2 = 0;
                        Integer cant_3 = 0;
                        Integer cant_4 = 0;
                        Integer cant_5 = 0;
                        Integer cant_6 = 0;
                        Integer cant_7 = 0;
                        Integer cant_8 = 0;
                        Integer cant_9 = 0;
                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            for (DataSnapshot messageSnapshot1 : messageSnapshot.getChildren()) {
                                String valor = (String) messageSnapshot1.child("opcion").getValue();
                                System.out.println(valor);
                                switch (valor) {
                                    case "Olivas":
                                        cant_1++;
                                        break;
                                    case "Jamón":
                                        cant_2++;
                                        break;
                                    case "Vitel Toné":
                                        cant_3++;
                                        break;
                                    case "Choclo y Queso":
                                        cant_4++;
                                        break;
                                    case "Húngaro":
                                        cant_5++;
                                        break;
                                    case "Trujillo":
                                        cant_6++;
                                        break;
                                    case "Criolla":
                                        cant_7++;
                                        break;
                                    case "Provenzal":
                                        cant_8++;
                                        break;
                                    case "Chimichurri":
                                        cant_9++;
                                        break;
                                }
                            }
                        }
                        valores_pregunta9.put("TOTAL", ((Long) dataSnapshot.getChildrenCount()).intValue());

                        valores_pregunta9.put("Olivas",cant_1);
                        valores_pregunta9.put("Jamón",cant_2);
                        valores_pregunta9.put("Vitel Toné",cant_3);
                        valores_pregunta9.put("Húngaro",cant_4);
                        valores_pregunta9.put("Choclo y Queso",cant_5);
                        valores_pregunta9.put("Trujillo",cant_6);
                        valores_pregunta9.put("Criolla",cant_7);
                        valores_pregunta9.put("Provenzal",cant_8);
                        valores_pregunta9.put("Chimichurri",cant_9);
                        updateValoresPregunta9();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void getPregunta_10(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_10").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String valor = (String) messageSnapshot.child("respuesta").getValue();
                            valores_pregunta10.add(valor);
                        }
                        updateValoresPregunta10();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void getPregunta_11(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");
        myRef.child("pregunta_11").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer cant_si = 0;
                        Integer cant_no = 0;

                        for (DataSnapshot messageSnapshot : dataSnapshot.getChildren()) {
                            String id = (String) (messageSnapshot.getKey());
                            String calificacion = (String) messageSnapshot.child("respuesta").getValue();
                            switch (calificacion) {
                                case ("Si"):
                                    cant_si++;
                                    break;
                                case ("No"):
                                    cant_no++;
                                    break;
                            }

                        }
                        valores_pregunta11.put("TOTAL", ((Long) dataSnapshot.getChildrenCount()).intValue());
                        valores_pregunta11.put("CANT_SI", cant_si);
                        valores_pregunta11.put("CANT_NO", cant_no);

                        updateValoresPregunta11();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w("s", "getUser:onCancelled", databaseError.toException());
                    }
                });
    }

    public void updateValoresPregunta1(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart);
        TextView txtCantidad = (TextView) findViewById(R.id.txtCantidad);
        TextView txtTitulo = (TextView) findViewById(R.id.txtPregunta);
        txtTitulo.setText("1-¿Cuánto calificarías el servicio en general de La Parrilla al Pan?");
        txtCantidad.setText(valores_pregunta1.get("TOTAL").toString());
        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta1.get("EXCELENTE") * 100) / valores_pregunta1.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta1.get("EXCELENTE")*100)/ valores_pregunta1.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta1.get("MUY_BUENO") * 100) / valores_pregunta1.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta1.get("MUY_BUENO") * 100) / valores_pregunta1.get("TOTAL")), 1));
        }
        if ((float) (valores_pregunta1.get("BUENO") * 100) / valores_pregunta1.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta1.get("BUENO") * 100) / valores_pregunta1.get("TOTAL")), 2));
        }
        if ((float) (valores_pregunta1.get("REGULAR") * 100) / valores_pregunta1.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta1.get("REGULAR") * 100) / valores_pregunta1.get("TOTAL")), 3));
        }
        if ((float) (valores_pregunta1.get("MALO") * 100) / valores_pregunta1.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta1.get("MALO") * 100) / valores_pregunta1.get("TOTAL")), 4));
        }
        PieDataSet dataset = new PieDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta1.get("EXCELENTE") * 100) / valores_pregunta1.get("TOTAL") > 0){
            labels.add("Excelente");
        }
        if ((float) (valores_pregunta1.get("MUY_BUENO") * 100) / valores_pregunta1.get("TOTAL") > 0) {
            labels.add("Muy Bueno");
        }
        if ((float) (valores_pregunta1.get("BUENO") * 100) / valores_pregunta1.get("TOTAL") > 0) {
            labels.add("Bueno");
        }
        if ((float) (valores_pregunta1.get("REGULAR") * 100) / valores_pregunta1.get("TOTAL") > 0) {
            labels.add("Regular");
        }
        if ((float) (valores_pregunta1.get("MALO") * 100) / valores_pregunta1.get("TOTAL") > 0) {
           labels.add("Malo");
        }
        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(18);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);
    }

    public void updateValoresPregunta2(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart1);
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo2);
        txtTitulo.setText("2-¿Cuánto calificarías la atención al público tanto en el local, en el Whatspp, llamadas y redes sociales?");

        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta2.get("EXCELENTE") * 100) / valores_pregunta2.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta2.get("EXCELENTE")*100)/ valores_pregunta2.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta2.get("MUY_BUENO") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta2.get("MUY_BUENO") * 100) / valores_pregunta2.get("TOTAL")), 1));
        }
        if ((float) (valores_pregunta2.get("BUENO") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta2.get("BUENO") * 100) / valores_pregunta2.get("TOTAL")), 2));
        }
        if ((float) (valores_pregunta2.get("REGULAR") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta2.get("REGULAR") * 100) / valores_pregunta2.get("TOTAL")), 3));
        }
        if ((float) (valores_pregunta2.get("MALO") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta2.get("MALO") * 100) / valores_pregunta2.get("TOTAL")), 4));
        }
        PieDataSet dataset = new PieDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta2.get("EXCELENTE") * 100) / valores_pregunta2.get("TOTAL") > 0){
            labels.add("Excelente");
        }
        if ((float) (valores_pregunta2.get("MUY_BUENO") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            labels.add("Muy Bueno");
        }
        if ((float) (valores_pregunta2.get("BUENO") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            labels.add("Bueno");
        }
        if ((float) (valores_pregunta2.get("REGULAR") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            labels.add("Regular");
        }
        if ((float) (valores_pregunta2.get("MALO") * 100) / valores_pregunta2.get("TOTAL") > 0) {
            labels.add("Malo");
        }
        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(18);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);
    }

    public void updateValoresPregunta3(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart3);
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo3);
        txtTitulo.setText("3-¿Cuánto calificarías la labor de nuestros ayudantes?");

        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta3.get("EXCELENTE") * 100) / valores_pregunta3.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta3.get("EXCELENTE")*100)/ valores_pregunta3.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta3.get("MUY_BUENO") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta3.get("MUY_BUENO") * 100) / valores_pregunta3.get("TOTAL")), 1));
        }
        if ((float) (valores_pregunta3.get("BUENO") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta3.get("BUENO") * 100) / valores_pregunta3.get("TOTAL")), 2));
        }
        if ((float) (valores_pregunta3.get("REGULAR") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta3.get("REGULAR") * 100) / valores_pregunta3.get("TOTAL")), 3));
        }
        if ((float) (valores_pregunta3.get("MALO") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta3.get("MALO") * 100) / valores_pregunta3.get("TOTAL")), 4));
        }
        PieDataSet dataset = new PieDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta3.get("EXCELENTE") * 100) / valores_pregunta3.get("TOTAL") > 0){
            labels.add("Excelente");
        }
        if ((float) (valores_pregunta3.get("MUY_BUENO") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            labels.add("Muy Bueno");
        }
        if ((float) (valores_pregunta3.get("BUENO") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            labels.add("Bueno");
        }
        if ((float) (valores_pregunta3.get("REGULAR") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            labels.add("Regular");
        }
        if ((float) (valores_pregunta3.get("MALO") * 100) / valores_pregunta3.get("TOTAL") > 0) {
            labels.add("Malo");
        }
        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(18);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);
    }

    public void updateValoresPregunta4(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart4);
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo4);
        txtTitulo.setText("4-¿Cuánto calificarías el tiempo de espera para la entrega de nuestro producto?");

        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta4.get("EXCELENTE") * 100) / valores_pregunta4.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta4.get("EXCELENTE")*100)/ valores_pregunta4.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta4.get("MUY_BUENO") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta4.get("MUY_BUENO") * 100) / valores_pregunta4.get("TOTAL")), 1));
        }
        if ((float) (valores_pregunta4.get("BUENO") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta4.get("BUENO") * 100) / valores_pregunta4.get("TOTAL")), 2));
        }
        if ((float) (valores_pregunta4.get("REGULAR") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta4.get("REGULAR") * 100) / valores_pregunta4.get("TOTAL")), 3));
        }
        if ((float) (valores_pregunta4.get("MALO") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta4.get("MALO") * 100) / valores_pregunta4.get("TOTAL")), 4));
        }
        PieDataSet dataset = new PieDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta4.get("EXCELENTE") * 100) / valores_pregunta4.get("TOTAL") > 0){
            labels.add("Excelente");
        }
        if ((float) (valores_pregunta4.get("MUY_BUENO") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            labels.add("Muy Bueno");
        }
        if ((float) (valores_pregunta4.get("BUENO") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            labels.add("Bueno");
        }
        if ((float) (valores_pregunta4.get("REGULAR") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            labels.add("Regular");
        }
        if ((float) (valores_pregunta4.get("MALO") * 100) / valores_pregunta4.get("TOTAL") > 0) {
            labels.add("Malo");
        }

        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(18);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);
    }

    public void updateValoresPregunta5(){
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo5);
        txtTitulo.setText("5-Alguna sugerencia respecto al tiempo de espera");
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_post);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        Sugerencia_1View mAdapter = new Sugerencia_1View( valores_pregunta5);
        mRecyclerView.setAdapter(mAdapter);

    }

    public void updateValoresPregunta6(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart6);
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo6);
        txtTitulo.setText("6-¿Pagarías un 10% más por una mejora del packaging/embalaje?");
        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta6.get("CANT_SI") * 100) / valores_pregunta6.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta6.get("CANT_SI")*100)/ valores_pregunta6.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta6.get("CANT_NO") * 100) / valores_pregunta6.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta6.get("CANT_NO") * 100) / valores_pregunta6.get("TOTAL")), 1));
        }


        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta6.get("CANT_SI") * 100) / valores_pregunta6.get("TOTAL") > 0){
            labels.add("Si");
        }
        if ((float) (valores_pregunta6.get("CANT_NO") * 100) / valores_pregunta6.get("TOTAL") > 0) {
            labels.add("No");
        }
        PieDataSet dataset = new PieDataSet(entries, "");
        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(18);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);
    }

    public  void  updateValoresPregunta7(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart7);
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo7);
        txtTitulo.setText("7-¿Qué producto de La Parrilla al Pan recomedarías?");

        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta7.get("Bondiola de cerdo") * 100) / valores_pregunta7.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta7.get("Bondiola de cerdo")*100)/ valores_pregunta7.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta7.get("Cuadril") * 100) / valores_pregunta7.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta7.get("Cuadril") * 100) / valores_pregunta7.get("TOTAL")), 1));
        }


        if ((float) (valores_pregunta7.get("Suprema de pollo") * 100) / valores_pregunta7.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta7.get("Suprema de pollo") * 100) / valores_pregunta7.get("TOTAL")), 1));
        }

        if ((float) (valores_pregunta7.get("Combinado") * 100) / valores_pregunta7.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta7.get("Combinado") * 100) / valores_pregunta7.get("TOTAL")), 1));
        }


        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta7.get("Bondiola de cerdo") * 100) / valores_pregunta7.get("TOTAL") > 0){
            labels.add("Bondiola de cerdo");
        }
        if ((float) (valores_pregunta7.get("Cuadril") * 100) / valores_pregunta7.get("TOTAL") > 0) {
            labels.add("Cuadril");
        }

        if ((float) (valores_pregunta7.get("Suprema de pollo") * 100) / valores_pregunta7.get("TOTAL") > 0) {
            labels.add("Suprema de pollo");
        }

        if ((float) (valores_pregunta7.get("Combinado") * 100) / valores_pregunta7.get("TOTAL") > 0) {
            labels.add("Combinado");
        }

        PieDataSet dataset = new PieDataSet(entries, "");
        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(18);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);
    }

    public void updateValoresPregunta8(){
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo8);
        txtTitulo.setText("8-¿Qué otro local de comidas rápidas y/o producto nos recomendarias?");
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_8);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        Sugerencia_1View mAdapter = new Sugerencia_1View( valores_pregunta8);
        mRecyclerView.setAdapter(mAdapter);
    }

    public  void  updateValoresPregunta9(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart9);
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo9);
        txtTitulo.setText("9-¿Qué salsas probaste de La Parrila al Pan y te gusto?");


        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta9.get("Olivas") * 100) / valores_pregunta9.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta9.get("Olivas")*100)/ valores_pregunta9.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta9.get("Jamón") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Jamón") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }

        if ((float) (valores_pregunta9.get("Húngaro") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Húngaro") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }
        if ((float) (valores_pregunta9.get("Vitel Toné") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Vitel Toné") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }
        if ((float) (valores_pregunta9.get("Choclo y Queso") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Choclo y Queso") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }

        if ((float) (valores_pregunta9.get("Trujillo") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Trujillo") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }

        if ((float) (valores_pregunta9.get("Criolla") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Criolla") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }

        if ((float) (valores_pregunta9.get("Provenzal") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Provenzal") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }

        if ((float) (valores_pregunta9.get("Chimichurri") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta9.get("Chimichurri") * 100) / valores_pregunta9.get("TOTAL")), 1));
        }

        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta9.get("Olivas") * 100) / valores_pregunta7.get("TOTAL") > 0){
            labels.add("Olivas");
        }
        if ((float) (valores_pregunta9.get("Jamón") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Jamón");
        }

        if ((float) (valores_pregunta9.get("Vitel Toné") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Vitel Toné");
        }

        if ((float) (valores_pregunta9.get("Húngaro") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Húngaro");
        }

        if ((float) (valores_pregunta9.get("Choclo y Queso") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Choclo y Queso");
        }

        if ((float) (valores_pregunta9.get("Trujillo") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Trujillo");
        }

        if ((float) (valores_pregunta9.get("Criolla") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Criolla");
        }
        if ((float) (valores_pregunta9.get("Provenzal") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Provenzal");
        }

        if ((float) (valores_pregunta9.get("Chimichurri") * 100) / valores_pregunta9.get("TOTAL") > 0) {
            labels.add("Chimichurri");
        }
        PieDataSet dataset = new PieDataSet(entries, "");
        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(14);
        int a[] =  {Color.RED,Color.BLUE,Color.CYAN,Color.DKGRAY,Color.GREEN,Color.MAGENTA, Color.GRAY,Color.YELLOW,Color.WHITE};
        dataset.setColors(ColorTemplate.createColors(a)); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);

    }
    public void updateValoresPregunta10(){
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo10);
        txtTitulo.setText("10-¿Qué otra salsa te gustaría que tenga de La Parrilla al Pan?");
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_10);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        Sugerencia_1View mAdapter = new Sugerencia_1View( valores_pregunta10);
        mRecyclerView.setAdapter(mAdapter);

    }

    public void updateValoresPregunta11(){
        PieChart pieChart = (PieChart) findViewById(R.id.chart11);
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo11);
        txtTitulo.setText("11-¿Pagarías un 20% por consumir un mejor corte de carne? Por Ejemplo, Lomito");
        ArrayList<Entry> entries = new ArrayList<>();
        if ((float) (valores_pregunta11.get("CANT_SI") * 100) / valores_pregunta11.get("TOTAL") > 0){
            entries.add(new Entry(((float)valores_pregunta11.get("CANT_SI")*100)/ valores_pregunta6.get("TOTAL"), 0));
        }
        if ((float) (valores_pregunta11.get("CANT_NO") * 100) / valores_pregunta11.get("TOTAL") > 0) {
            entries.add(new Entry(((float) (valores_pregunta11.get("CANT_NO") * 100) / valores_pregunta6.get("TOTAL")), 1));
        }


        ArrayList<String> labels = new ArrayList<String>();
        if ((float) (valores_pregunta11.get("CANT_SI") * 100) / valores_pregunta11.get("TOTAL") > 0){
            labels.add("Si");
        }
        if ((float) (valores_pregunta11.get("CANT_NO") * 100) / valores_pregunta11.get("TOTAL") > 0) {
            labels.add("No");
        }
        PieDataSet dataset = new PieDataSet(entries, "");
        PieData data = new PieData(labels, dataset);
        dataset.setValueTextSize(18);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("");
        pieChart.setData(data);

        pieChart.animateY(5000);
    }

}
