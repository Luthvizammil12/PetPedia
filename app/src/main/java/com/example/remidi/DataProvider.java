package com.example.remidi;

import android.content.Context;

import com.example.remidi.model.Anjing;
import com.example.remidi.model.Burung;
import com.example.remidi.model.Kucing;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Kucing> kucings = new ArrayList<>();
    private static List<Anjing> anjings = new ArrayList<>();
    private static List<Burung> burungs = new ArrayList<>();

    static void iniDataKucing(Context ctx) {

        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
    }

    static void initDataAnjing(Context ctx) {
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));

    }

    static void iniDataBurung(Context ctx) {
        burungs.add(new Burung("Kutilang", " suku Pycnonotidae",
                "sejenis burung pengicau Dalam bahasa Inggris burung ini disebut Sooty-headed Bulbul, sementara nama ilmiahnya adalah Pycnonotus aurigaster; mengacu pada bulu-bulu di sekitar pantatnya yang berwarna jingga", R.drawable.bird_kutilang));
        burungs.add(new Burung("Nuri Bayan", "Maluku, Kepulauwan Salomon",
                "burung berukuran sedang, dengan panjang sekitar 43cm, dari salah satu genus burung paruh-bengkok Eclectus. Burung ini sangat berbeda dengan burung paruh-bengkok lainnya.", R.drawable.bird_bayan));
        burungs.add(new Burung("Cendrawasih","Papua Nugini, dan Australia timur",
                "Burung anggota keluarga ini dikenal karena bulu burung jantan pada banyak jenisnya, terutama bulu yang sangat memanjang dan rumit yang tumbuh dari paruh, sayap atau kepalanya. Ukuran burung Cenderawasih mulai dari Cenderawasih raja pada 50 gram dan 15 cm hingga Cenderawasih paruh-sabit Hitam pada 110 cm dan Cenderawasih manukod jambul-bergulung pada 430 gram.",R.drawable.bird_cendrawasih));
        burungs.add(new Burung("LoveBird"," barat daya Afrika",
                "Burung lovebird merupakan burung sosial. Di alam bebas, burung ini hidup berkelompok. Setiap kelompok terdiri dari 5-20 ekor. Burung dewasa hidup berpasangan. Disebut “love bird” atau “burung cinta” karena burung ini baru berpisah dari pasangannya bila salah satunya mati.", R.drawable.bird_lovebird));
        burungs.add(new Burung("Parkit","Benua Australia",
                "burung bertubuh kecil dan masih berkerabat dengan burung betet aruh parkit pun berbentuk bengkok sehingga seacra morfologi mempunyai kemiripan dengan burung betet. Dalam istilah internasional, burung paruh bengkok ini dikenal dengan nama budgerigar atau parakeet.", R.drawable.bird_parkit));
        burungs.add(new Burung("Elang Jawa","Jawa",
                " jenis burung elang yang berukuran sedang. Panjang tubuhnya mencapai 60-70 cm (dari paruh hingga ujung ekor Bulu umumnya berwarna cokelat kemerahan pada bagian kepala dan perut, keemasan atau cokelat kekuningan pada bagian tengkuk, pada bagian sayap cokelat gelap atau kehitaman.",R.drawable.bird_elang));

    }

    public static List<Kucing> getAllKucings(Context ctx){
        if (kucings.size() == 0) {
            iniDataKucing(ctx);
        }
        return kucings;
    }

    public static List<Anjing> getAllAnjings(Context ctx){
        if (anjings.size() == 0){
            initDataAnjing(ctx);
        }
        return anjings;
    }

    public static List<Burung> getAllBurung(Context ctx){
        if (burungs.size() == 0){
            iniDataBurung(ctx);
        }
        return burungs;
    }
}
