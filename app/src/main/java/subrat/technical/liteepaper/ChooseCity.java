package subrat.technical.liteepaper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ChooseCity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    //City Variables
    public static String cityVar;

    String[] city = new String[]{"Choose A City"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);

        spinner = (Spinner) findViewById(R.id.spinner);

        try {
            switch (MainActivity.selectedPaper) {
                case "haribhumi":
                    city = new String[]{"Choose A City", "Delhi", "Raipur", "Bilaspur", "Rohtak", "Jabalpur"};
                    spinnerUpdate();
                    break;
                case "amarujala":
                    city = new String[]{"Choose A City",
                            "Agra city", "Agra dehat", "Aligarh city", "Aligarh dehat", "Allahabad city",
                            "Allahabad Gangapar", "Allahabad Naini", "Almora", "Ambala", "Ambedkar nagar",
                            "Auraiya", "Azamgarh", "Badaun", "Baghpat", "Bahraich", "Balia", "Banda", "Barabanki",
                            "Bareilly city", "Bareilly dehat", "Basti", "Bhadohi", "Bhiwani", "Bijnor", "Bilaspur",
                            "Bulandsahar", "Chamba", "Chandauli", "Chandigarh city", "Charkhi Dadri", "Dehradun city",
                            "Delhi", "Deoria", "Etah", "Etawa", "Faizabad", "Faridabad", "Farrukhabad", "Fatehabad",
                            "Fatehpur", "Firozabad", "Garhwal", "Ghaziabad", "Ghaziabad-Trans Hindon Area", "Ghazipur",
                            "Gonda-balrampur", "Gorakhpur city", "Gorakhpur dehat", "Greater noida", "Gurugram",
                            "Hamirpur (Himachal)", "Hamirpur (UP)", "Hapur", "Hardoi", "Haridwar", "Hathras", "Hisar",
                            "Jalandhar", "Jalaun", "Jammu city", "Jammu dehat", "Jhajjar", "Jhansi city", "Jhansi dehat",
                            "Jind", "Jounpur", "Jpnagar", "Kaithal", "Kangra", "Kannauj", "Kanpur city", "Kanpur dehat",
                            "Kanpur Ghatampur", "Karnal", "Kathua", "Kaushambi", "Kotdwar", "Kullu", "Kurukshetra",
                            "Kushinagar", "Lakhimpur Kheri", "Lalitpur", "Lucknow city", "Mainpuri", "Mandi",
                            "Mathura", "Mau", "Meerut city", "Meerut dehat", "Mharajgunj", "Mirzapur", "Mohali",
                            "Moradabad city", "Moradabad dehat", "Muzaffarnagar", "Nainital", "Narnaul", "Noida",
                            "Panchkula", "Panipat", "Pilibhit", "Pithoragarh", "Pratapgarh", "Raebareli", "Rajasthan",
                            "Rampur (Himachal)", "Rampur (UP)", "Rewari", "Rishikesh", "Rohtak", "Roorkee",
                            "Saharanpur city", "Saharanpur dehat", "Sambhal", "Santkabirnagar", "Shahjahanpur",
                            "Shamli / muzaffarnagar dehat", "Shimla", "Siddharthnagar", "Sirmaur", "Sirsa",
                            "Sitapur", "Solan", "Sonbhadra", "Sonipat", "Sultanpur", "Udhampur", "Udhamsingh nagar",
                            "Una", "Unnao", "Varanasi", "Vikas nagar", "Yamuna nagar",
                    };
                    spinnerUpdate();
                    break;
                case "jagran":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "dainikbhaskar":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "hindustan":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "jansatta":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "loktej":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "naidunia":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "nbt":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "prabhatkhabar":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "punjabkesari":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                case "patrika":
                    //code to be executed;
                    spinnerUpdate();
                    break;
                default:
                    Toast.makeText(this, "Please Select a Newspaper from Previous Activity", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Log.e("Choose City", e.getMessage());
        }


    }

    public void cityVariableUpdate(String cityName) {
        try {
            switch (MainActivity.selectedPaper) {

                /**
                 * Haribhumi
                 */

                case "harinhumi":
                    switch (cityName) {
                        case "Delhi":
                            cityVar = "hr";
                            break;
                        case "Raipur":
                            cityVar = "rai";
                            break;
                        case "Bilaspur":
                            cityVar = "bp";
                            break;
                        case "Rohtak":
                            cityVar = "ro";
                            break;
                        case "Jabalpur":
                            cityVar = "jb";
                            break;
                        default:
                            cityVar = "hr";
                    }
                    break;

                /**
                 * AmarUjala
                 */

                case "amarujala":
                    switch (cityName) {

                        case "Agra city":
                            cityVar = "ac";
                            break;
                        case "Agra dehat":
                            cityVar = "ad";
                            break;
                        case "Aligarh city":
                            cityVar = "ct";
                            break;

                        case "Aligarh dehat":
                            cityVar = "dt";
                            break;
                        case "Allahabad city":
                            cityVar = "ca";
                            break;
                        case "Allahabad Gangapar":
                            cityVar = "gp";
                            break;
                        case "Allahabad Naini":
                            cityVar = "na";
                            break;
                        case "Almora":
                            cityVar = "al";
                            break;
                        case "Ambala":
                            cityVar = "am";
                            break;
                        case "Ambedkar nagar":
                            cityVar = "an";
                            break;
                        case "Auraiya":
                            cityVar = "au";
                            break;
                        case "Azamgarh":
                            cityVar = "az";
                            break;
                        case "Badaun":
                            cityVar = "bn";
                            break;
                        case "Baghpat":
                            cityVar = "bg";
                            break;
                        case "Bahraich":
                            cityVar = "bh";
                            break;
                        case "Balia":
                            cityVar = "bl";
                            break;
                        case "Banda":
                            cityVar = "bd";
                            break;
                        case "Barabanki":
                            cityVar = "bb";
                            break;
                        case "Bareilly city":
                            cityVar = "cb";
                            break;
                        case "Bareilly dehat":
                            cityVar = "db";
                            break;
                        case "Basti":
                            cityVar = "bs";
                            break;
                        case "Bhadohi":
                            cityVar = "bo";
                            break;
                        case "Bhiwani":
                            cityVar = "bw";
                            break;
                        case "Bijnor":
                            cityVar = "bj";
                            break;
                        case "Bilaspur":
                            cityVar = "bp";
                            break;
                        case "Bulandsahar":
                            cityVar = "bu";
                            break;
                        case "Chamba":
                            cityVar = "ch";
                            break;
                        case "Chandauli":
                            cityVar = "cd";
                            break;
                        case "Chandigarh city":
                            cityVar = "cc";
                            break;
                        case "Charkhi Dadri":
                            cityVar = "ci";
                            break;
                        case "Dehradun city":
                            cityVar = "dc";
                            break;
                        case "Delhi":
                            cityVar = "dl";
                            break;
                        case "Deoria":
                            cityVar = "do";
                            break;
                        case "Etah":
                            cityVar = "et";
                            break;
                        case "Etawa":
                            cityVar = "ew";
                            break;
                        case "Faizabad":
                            cityVar = "fz";
                            break;
                        case "Faridabad":
                            cityVar = "fb";
                            break;
                        case "Farrukhabad":
                            cityVar = "fd";
                            break;
                        case "Fatehabad":
                            cityVar = "ft";
                            break;
                        case "Fatehpur":
                            cityVar = "fp";
                            break;
                        case "Firozabad":
                            cityVar = "fr";
                            break;
                        case "Garhwal":
                            cityVar = "gh";
                            break;
                        case "Ghaziabad":
                            cityVar = "ga";
                            break;
                        case "Ghaziabad-Trans Hindon Area":
                            cityVar = "th";
                            break;
                        case "Ghazipur":
                            cityVar = "gz";
                            break;
                        case "Gonda-balrampur":
                            cityVar = "gb";
                            break;
                        case "Gorakhpur city":
                            cityVar = "gc";
                            break;
                        case "Gorakhpur dehat":
                            cityVar = "gd";
                            break;
                        case "Greater noida":
                            cityVar = "gn";
                            break;
                        case "Gurugram":
                            cityVar = "gr";
                            break;
                        case "Hamirpur (Himachal)":
                            cityVar = "ha";
                            break;
                        case "Hamirpur (UP)":
                            cityVar = "hm";
                            break;
                        case "Hapur":
                            cityVar = "hp";
                            break;
                        case "Hardoi":
                            cityVar = "ho";
                            break;
                        case "Haridwar":
                            cityVar = "hd";
                            break;
                        case "Hathras":
                            cityVar = "ht";
                            break;
                        case "Hisar":
                            cityVar = "hs";
                            break;
                        case "Jalandhar":
                            cityVar = "jl";
                            break;
                        case "Jalaun":
                            cityVar = "ja";
                            break;
                        case "Jammu city":
                            cityVar = "cj";
                            break;
                        case "Jammu dehat":
                            cityVar = "dj";
                            break;
                        case "Jhajjar":
                            cityVar = "jj";
                            break;
                        case "Jhansi city":
                            cityVar = "jy";
                            break;
                        case "Jhansi dehat":
                            cityVar = "jd";
                            break;
                        case "Jind":
                            cityVar = "jn";
                            break;
                        case "Jounpur":
                            cityVar = "jr";
                            break;
                        case "Jpnagar":
                            cityVar = "jp";
                            break;
                        case "Kaithal":
                            cityVar = "kt";
                            break;
                        case "Kangra":
                            cityVar = "kg";
                            break;
                        case "Kannauj":
                            cityVar = "kj";
                            break;
                        case "Kanpur city":
                            cityVar = "kc";
                            break;
                        case "Kanpur dehat":
                            cityVar = "kd";
                            break;
                        case "Kanpur Ghatampur":
                            cityVar = "gm";
                            break;
                        case "Karnal":
                            cityVar = "kn";
                            break;
                        case "Kathua":
                            cityVar = "ku";
                            break;
                        case "Kaushambi":
                            cityVar = "kh";
                            break;
                        case "Kotdwar":
                            cityVar = "kw";
                            break;
                        case "Kullu":
                            cityVar = "kl";
                            break;
                        case "Kurukshetra":
                            cityVar = "kk";
                            break;
                        case "Kushinagar":
                            cityVar = "ks";
                            break;
                        case "Lakhimpur Kheri":
                            cityVar = "lk";
                            break;
                        case "Lalitpur":
                            cityVar = "lt";
                            break;
                        case "Lucknow city":
                            cityVar = "lc";
                            break;
                        case "Mainpuri":
                            cityVar = "mp";
                            break;
                        case "Mandi":
                            cityVar = "ma";
                            break;
                        case "Mathura":
                            cityVar = "mt";
                            break;
                        case "Mau":
                            cityVar = "mu";
                            break;
                        case "Meerut city":
                            cityVar = "cm";
                            break;
                        case "Meerut dehat":
                            cityVar = "dm";
                            break;
                        case "Mharajgunj":
                            cityVar = "mh";
                            break;
                        case "Mirzapur":
                            cityVar = "mz";
                            break;
                        case "Mohali":
                            cityVar = "ml";
                            break;
                        case "Moradabad city":
                            cityVar = "mc";
                            break;
                        case "Moradabad dehat":
                            cityVar = "dh";
                            break;
                        case "Muzaffarnagar":
                            cityVar = "mf";
                            break;
                        case "Nainital":
                            cityVar = "hl";
                            break;
                        case "Narnaul":
                            cityVar = "nn";
                            break;
                        case "Noida":
                            cityVar = "nd";
                            break;
                        case "Panchkula":
                            cityVar = "pk";
                            break;
                        case "Panipat":
                            cityVar = "pn";
                            break;
                        case "Pilibhit":
                            cityVar = "pb";
                            break;
                        case "Pithoragarh":
                            cityVar = "pt";
                            break;
                        case "Pratapgarh":
                            cityVar = "pg";
                            break;
                        case "Raebareli":
                            cityVar = "rb";
                            break;
                        case "Rajasthan":
                            cityVar = "rj";
                            break;
                        case "Rampur (Himachal)":
                            cityVar = "rm";
                            break;
                        case "Rampur (UP)":
                            cityVar = "rp";
                            break;
                        case "Rewari":
                            cityVar = "rw";
                            break;
                        case "Rishikesh":
                            cityVar = "rk";
                            break;
                        case "Rohtak":
                            cityVar = "rt";
                            break;
                        case "Roorkee":
                            cityVar = "rr";
                            break;
                        case "Saharanpur city":
                            cityVar = "sc";
                            break;
                        case "Saharanpur dehat":
                            cityVar = "st";
                            break;
                        case "Sambhal":
                            cityVar = "sa";
                            break;
                        case "Santkabirnagar":
                            cityVar = "sk";
                            break;
                        case "Shahjahanpur":
                            cityVar = "sp";
                            break;
                        case "Shamli / muzaffarnagar dehat":
                            cityVar = "md";
                            break;
                        case "Shimla":
                            cityVar = "sh";
                            break;
                        case "Siddharthnagar":
                            cityVar = "sn";
                            break;
                        case "Sirmaur":
                            cityVar = "sm";
                            break;
                        case "Sirsa":
                            cityVar = "sr";
                            break;
                        case "Sitapur":
                            cityVar = "si";
                            break;
                        case "Solan":
                            cityVar = "sl";
                            break;
                        case "Sonbhadra":
                            cityVar = "sb";
                            break;
                        case "Sonipat":
                            cityVar = "so";
                            break;
                        case "Sultanpur":
                            cityVar = "su";
                            break;
                        case "Udhampur":
                            cityVar = "um";
                            break;
                        case "Udhamsingh nagar":
                            cityVar = "us";
                            break;
                        case "Una":
                            cityVar = "un";
                            break;
                        case "Unnao":
                            cityVar = "uo";
                            break;
                        case "Varanasi":
                            cityVar = "vc";
                            break;
                        case "Vikas nagar":
                            cityVar = "vk";
                            break;
                        case "Yamuna nagar":
                            cityVar = "ym";
                            break;
                    }
                    break;
            }

        } catch (Exception e) {
            Log.e("Choose City", e.getMessage());
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        try {
            TextView view1 = (TextView) view;
            cityVariableUpdate((String) view1.getText());
            if ((String) view1.getText() != "Choose A City") {
                Toast.makeText(this, "you selected" + view1.getText(), Toast.LENGTH_SHORT).show();
                nextActivity();
            }
        } catch (Exception e) {
            Log.e("Choose City", e.getMessage());
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void spinnerUpdate() {
        try {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(ChooseCity.this, android.R.layout.simple_spinner_item, city);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
        } catch (Exception e) {
            Log.e("Choose City", e.getMessage());
        }

    }

    public void nextActivity() {
        try {
            Intent intent = new Intent(ChooseCity.this, ReadPaper.class);
            startActivity(intent);
        } catch (Exception e) {
            Log.e("Choose City", e.getMessage());
        }

    }

    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(ChooseCity.this, MainActivity.class);
            startActivity(intent);
        } catch (Exception e) {
            Log.e("Choose City", e.getMessage());
        }

    }
}
