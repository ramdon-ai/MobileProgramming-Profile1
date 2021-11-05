package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.influenza,"Influenza","Rp18.000","Flu adalah penyakit yang disebabkan virus yang terus bermutasi sehingga sulit dideteksi sistem kekebalan tubuh. Gejala umum penyakit flu adalah nyeri otot, batuk, bersin-bersin, hidung tersumbat, sakit kepala, kelelahan, dan demam.\n" +
                "Meski tergolong penyakit menular, saat ini flu dianggap tidak berbahaya. Namun, yang perlu diwaspadai adalah mutasi virus penyebab flu yang kemudian menyebabkan penyakit yang jauh lebih berbahaya, seperti flu burung.\n" +
                "Penularan: Secara langsung apabila cipratan air dari mulut (droplet) mengenai orang lain—saat bersin, batuk, atau berbicara. Penularan secara tidak langsung terjadi apabila Anda menyentuh permukaan atau benda yang telah terkontaminasi virus flu, lalu tangan Anda menyentuh mulut dan hidung sehingga virus masuk ke dalam tubuh.\n" +
                "Pencegahan:\n" +
                "1. Menjaga jarak dengan orang yang menderita penyakit flu.\n" +
                "2. Rajin membersihkan tangan dengan sabun ataupun hand sanitizer.\n" +
                "3. Orang yang sedang menderita flu sebaiknya mengenakan masker agar tidak menyebarkan virus ke orang lain.\n" +
                "4. Praktikkan etika batuk dan bersin yang benar, yaitu menutup mulut dan hidung dengan siku saat sedang batuk atau bersin.\n" +
                "5. Jaga daya tahan tubuh agar tidak mudah tertular virus flu.\n"))

        data?.add(DataModel(R.drawable.tuberkolosis,"Tuberkulosis","Rp15.000", "Penyakit infeksi pada saluran pernapasan ini disebabkan bakteri Mycobacterium tuberculosis. Gejala atau ciri penyakit menular ini adalah batuk berdahak yang berlangsung selama lebih dari dua minggu. Selain itu, penderita tuberkulosis juga akan kehilangan napsu makan, mengalami penurunan berat badan, berkeringat pada malam hari, dan kelelahan.\n" +
                "Penularan: Tuberkulosis menular melalui udara. Bila berdekatan dengan penderita tuberkulosis, Anda berisiko tinggi tertular saat penderita bernapas atau batuk. Cara penularan tuberkulosis yang lain adalah bila Anda menggunakan barang yang sebelumnya dipakai penderita tuberkulosis.\n" +
                "Pencegahan:\n" +
                "1. Tidak berdekatan dengan penderita tuberkulosis. Bila terpaksa, kenakan masker untuk melindungi saluran pernapasan Anda.\n" +
                "2. Hindari menyentuh atau menggunakan benda yang sebelumnya dipakai oleh penderita tuberkulosis.\n" +
                "3. Mendapat vaksinasi BCG (saat balita).\n" +
                "4. Perkuat daya tahan tubuh dengan mengonsumsi makanan bergizi dan berolahraga secara teratur."))

        data?.add(DataModel(R.drawable.cacar,"Cacar Air","Rp22.000", "Penyakit menular ini disebabkan infeksi virus Varicella zoster dan rentan menyerang anak berusia di bawah 12 tahun. Gejala cacar air adalah demam, timbul bintik kemerahan di kulit yang menggelembung maupun yang tidak, kulit seperti melepuh, dan terasa gatal.\n" +
                "Penularan: Cacar air menular melalui kontak langsung dengan penderitanya, yaitu bila terkena cairan yang keluar dari kulit yang menggelembung. Cacar air juga dapat menular melalui udara, misalnya saat penderita bernapas, bersin, atau batuk. Virus yang dikeluarkan kemudian terhirup orang lain. Cara penularan yang lain adalah bila Anda menyentuh benda yang telah dipegang penderita.\n" +
                "Pencegahan:\n" +
                "1. Lakukan vaksinasi cacar air.\n" +
                "2. Jaga kebersihan diri dan lingkungan.\n" +
                "3. Konsumsi makanan bergizi.\n" +
                "4. Tidak berdekatan dengan penderita cacar air."))

        data?.add(DataModel(R.drawable.dbd,"Demam Berdarah Dengue (DBD)","Rp21.000", "Penyakit ini disebabkan virus dengue yang dibawa nyamuk Aedes aegypti betina. Gejala umum penyakit DBD adalah demam tinggi, sakit pada persendian, muncul bintik merah di kulit, trombosit turun drastis, serta perdarahan.\n" +
                "Penularan: Virus dengue masuk ke tubuh manusia melalui gigitan nyamuk Aedes aegypti. Jumlah nyamuk Aedes aegypti biasanya meningkat pada awal musim hujan.\n" +
                "Pencegahan:\n" +
                "1. Tutup tempat-tempat yang menampung air.\n" +
                "2. Kuras bak mandi minimal satu kali dalam seminggu.\n" +
                "3. Bersihkan pekarangan rumah dari barang bekas yang berpotensi menjadi tempat berkembang biaknya jentik nyamuk Aedes aegypti.\n" +
                "4. Bersihkan genangan air di sekitar rumah agar tidak dihinggapi nyamuk Aedes aegypti."))

        data?.add(DataModel(R.drawable.hepatitis,"Hepatitis","Rp15.000", "Hepatitis adalah penyakit peradangan pada hati atau lever. Ciri penyakit menular hepatitis adalah demam, nyeri sendi, nyeri perut, dan penyakit kuning. Dalam situs Alodoc disebutkan, hepatitis dapat bersifat akut maupun kronis. Jika tidak segera ditangani dengan baik, hepatitis dapat menimbulkan komplikasi, seperti gagal hati, sirosis, atau kanker hati (hepatocellular carcinoma).\n" +
                "Penularan: Melalui makanan atau minuman yang tidak bersih, misalnya es batu yang proses pembuatannya terkontaminasi virus hepatitis. Penularan virus hepatitis B dan hepatitis C melalui darah dan cairan tubuh yang terinfeksi; seperti transfusi darah, hubungan seks, pembuatan tato dan tindik, serta injeksi.\n" +
                "Pencegahan:\n" +
                "1. Jaga kebersihan pangan yang hendak diolah maupun makanan yang hendak dikonsumsi.\n" +
                "2. Hindari pertukaran cairan tubuh yang berisiko, seperti hubungan seks yang tidak aman.\n" +
                "3. Hindari berbagi menggunakan barang pribadi, seperti handuk, pakaian, alat makan, dan sikat gigi dengan penderita hepatitis.\n" +
                "4. Pastikan Anda menggunakan jarum baru yang steril saat hendak melakukan injeksi, seperti transfusi darah, akupuntur, serta membuat tato atau tindik."))

        data?.add(DataModel(R.drawable.malaria,"Malaria","Rp22.000", "Penyakit menular yang disebabkan parasit plasmodium ini masih menjadi wabah di beberapa wilayah di Indonesia. Nyamuk Anopheles yang membawa parasit plasmodium berkembang biak di kubangan air alami; seperti sungai, sawah, tegalan, dan bekas genangan banjir. Ciri penyakit menular ini adalah demam tinggi berkepanjangan, tubuh menggigil, tubuh nyeri, mual, hingga muntah-muntah.\n" +
                "Penularan: Parasit plasmodium dibawa dan disebarkan oleh nyamuk Anopheles yang kemudian menggigit manusia.\n" +
                "Pencegahan:\n" +
                "1. Lindungi diri dari gigitan nyamuk dengan mengenakan pakaian dan celana panjang.\n" +
                "2. Memasang kelambu di tempat tidur.\n" +
                "3. Mengoleskan krim antinyamuk.\n" +
                "4. Minum obat antimalaria saat hendak bepergian ke wilayah yang diketahui terdapat banyak kasus malaria."))

        data?.add(DataModel(R.drawable.pneunomia,"Malaria","Rp22.000", "Pneumonia\n" +
                "\n" +
                "Dalam situs Halodoc dijelaskan, pneumonia adalah penyakit pernapasan akut yang menyerang paru-paru. Penderita pneumonia akan merasa kesakitan saat bernapas karena asupan oksigennya terganggu. Pneumonia disebabkan bakteri, virus, dan jamur. Penyebab pneumonia paling umum adalah bakteri Streptococcus pneumoniae dan virus Haemophilus influenzae tipe b (Hib).\n" +
                "Penularan: Melalui udara yang tercemar oleh bakteri, virus, atau parasit penyebab pneumonia.\n" +
                "Pencegahan:\n" +
                "1. Rajin cuci tangan menggunakan sabun.\n" +
                "2. Praktikkan etika batuk dan bersin yang benar.\n" +
                "3. Tidak berbagi alat makan dan mandi dengan orang lain."))

        data?.add(DataModel(R.drawable.tifus,"Malaria","Rp22.000", "Tifus\n" +
                "\n" +
                "Penyakit yang disebabkan infeksi bakteri Salmonella typhi dapat terjadi bila sanitasi di lingkungan Anda tidak baik. Gejala umum tifus adalah demam, sakit atau kram perut, diare atau sembelit, mual, dan muntah.\n" +
                "Penularan: Melalui konsumsi makanan atau minuman yang sudah terkontaminasi tinja yang mengandung bakteri Salmonella typhi. Selain itu bisa juga akibat menggunakan air yang terkontaminasi bakteri Salmonella typhi untuk mencuci bahan makanan, peralatan masak, serta perlengkapan makan.\n" +
                "Pencegahan:\n" +
                "1.Cuci tangan secara teratur, terutama sebelum dan sesudah makan.\n" +
                "2. Gunakan air bersih untuk mencuci bahan makanan, peralatan makan, dan peralatan masak.\n" +
                "3. Hindari membeli makanan yang tidak terjamin kebersihannya.\n" +
                "4. Jaga daya tahan tubuh tetap kuat."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.namalatin)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}