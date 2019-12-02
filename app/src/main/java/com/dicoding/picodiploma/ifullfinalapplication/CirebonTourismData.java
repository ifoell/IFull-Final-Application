package com.dicoding.picodiploma.ifullfinalapplication;

import java.util.ArrayList;

public class CirebonTourismData {
    private static String[] cirebonTourismName = {
            "Keraton Kesepuhan",
            "Keraton Kanoman",
            "Masjid Agung Sang Cipta Rasa",
            "Makam Sunan Gunung Jati",
            "Taman Sari Gua Sunyaragi",
            "Cirebon Waterland Taman Ade Irma Suryani",
            "Bukit Gronggong",
            "Telaga Remis",
            "Setu Patok",
            "Sentra Batik Trusmi",
            "Wanawisata Ciwaringin",
            "Hutan Plangon",
            "Desa Wisata Cikalahang",
            "Pantai Kejawanan",
            "Alun-alun Kejaksan"
    };

    private static String[] cirebonTourisminfo = {
            "Keraton Kasepuhan merupakan tempat wisata di Cirebon pertama yang wajib dikunjungi, terutama jika Anda tertarik dengan sejarah Cirebon. Keraton di Cirebon ini dibangun pada tahun 1529 oleh Pangeran Mas Mohammad Arifin yang notabene merupakan cicit Sunan Gunung Jati.\n" +
                    "\n" +
                    "Keraton yang semula dinamakan Keraton Pakungwati ini dibangun sebagai pusat pemerintahan Cirebon pada masa lalu. Nama tempat wisata di Cirebon ini kemudian diubah menjadi Keraton Kasepuhan setelah adanya pembagian wilayah keraton pada masa pemerintahan Pangeran Mertawijaya, yang dikenal sebagai Sultan Sepuh Mohammad Syamsudin Mertawijaya.\n" +
                    "\n" +
                    "Lantas, apa saja sih yang bisa dilihat di Keraton Kasepuhan?\n" +
                    "\n" +
                    "Anda dapat berkunjung ke museum keraton untuk melihat berbagai peninggalan bersejarah seperti kereta kencana, gamelan dari tahun 1426, lukisan antik Prabu Siliwangi, rebana peninggalan Sunan Kalijaga, hingga meriam mini. Anda pun dapat menjelajahi area Keraton untuk mengamati arsitekturnya yang memiliki nilai filosofi tinggi. Keraton Kasepuhan Cirebon berada di Jalan Kasepuhan Nomor 43, Lemahwungkuk, Kota Cirebon.",

            "Keraton Kanoman adalah destinasi wisata bersejarah di Cirebon yang tidak kalah menarik dari Keraton Kasepuhan. Meski sudah banyak mengalami pemugaran, Keraton Kanoman tetap memertahankan dekorasi dan gaya arsitektur khas Jawa dan Tiongkok yang mengandung nilai sejarah perkembangan kerajaan Islam di Indonesia. Berbagai koleksi benda bersejarah seperti lukisan, kerajinan keramik, serta kereta kencana Paksi Naga Liman yang legendaris dapat Anda temukan di tempat wisata di Cirebon ini.\n" +
                    "\n" +
                    "Sejak didirikan pada tahun 1678, Keraton Kanoman masih memegang adat dan tradisinya hingga saat ini. Salah satu tradisi keraton yang paling terkenal adalah Ritual Panjang Jimat yang biasa digelar setiap bulan Maulid. Ritual Panjang Jimat diawali dengan pencucian benda-benda pusaka milik Keraton Kanoman selama 40 hari dan dilanjutkan dengan prosesi arak-arakan benda pusaka dan gunungan hasil bumi dari Pendopo Jinem menuju Masjid Keraton Kanoman. Prosesi yang satu ini selalu dinanti warga Cirebon dan para wisatawan. Selain memiliki nilai filosofis tinggi, ritual Panjang Jimat juga dapat menjadi ajang mengucap syukur bagi warga di sekitar Keraton Kanoman.\n" +
                    "\n" +
                    "Keraton Kanoman dibuka setiap hari untuk wisatawan pada jam 09:00-17:00. Pengunjung hanya perlu membayar tiket masuk seharga Rp7.000 untuk menikmati wisata sejarah di Keraton Kanoman.",

            "Masjid tertua di Cirebon ini berlokasi di kompleks Keraton Kasepuhan. Arsitektur Masjid Agung Sang Cipta Rasa banyak didominasi pengaruh Kerajaan Islam pada masa lalu. Ciri khas tersebut dapat dilihat dari atap masjid yang tidak memiliki kemuncak seperti masjid-masjid lain di Pulau Jawa pada umumnya.\n" +
                    "\n" +
                    "Sepintas, masjid yang satu ini mungkin tidak tampak begitu istimewa. Meski tampak sederhana, ada kisah menarik di balik pembangunan masjid ini. Konon, pembangunan Masjid Sang Cipta Rasa melibatkan ratusan tokoh penting dari Kerajaan Demak, Majapahit, dan Cirebon. Sunan Gunung Jati bahkan menunjuk Sunan Kalijaga untuk merancang arsitektur masjid.\n" +
                    "\n" +
                    "Selain gaya arsitekturnya yang masih awet hingga sekarang, ada satu tradisi yang masih dipertahankan di Masjid Sang Cipta Rasa, yakni azan pitu. Azan pitu ialah ritual azan yang dilakukan oleh tujuh muazin secara bersamaan. Azan pitu biasanya dikumandangkan setiap salat Jumat di Masjid Agung Sang Cipta Rasa.",

            "Makam Sunan Gunung Jati sering dijadikan destinasi wisata religi bagi wisatawan yang berasal dari Pulau Jawa. Di tempat wisata di Cirebon ini Anda akan merasakan suasana khidmat berkat lantunan ayat-ayat suci yang bergema di seantero kompleks Makam Sunan Gunung Jati. Gaya arsitektur khas Tiongkok, Jawa, dan Arab pun berpadu sempurna membentuk harmoni yang menakjubkan. Beragam dekorasi porselen khas Tiongkok banyak disematkan di sekitar dinding makam.\n" +
                    "\n" +
                    "Daya tarik lain yang dimiliki Kompleks Makam Sunan Gunung Jati adalah adanya sembilan pintu yang disusun secara bertingkat. Namun, pengunjung hanya diperkenankan untuk masuk hingga pintu ke-lima, sebab pintu-pintu selanjutnya hanya diperuntukkan bagi keturunan Sunan Gunung Jati.\n" +
                    "\n" +
                    "Kompleks Makam Sunan Gunung Jati berlokasi di Jalan Alun-alun Astana Gunung Jati 53, Desa Astana, Kecamatan Gunung Jati.",

            "Beberapa tahun belakangan, minat wisatawan untuk mengunjungi Taman Sari Gua Sunyaragi semakin meningkat. Berkat pemugaran area taman dan pagelaran kesenian setiap tahunnya, tempat wisata di Cirebon ini kini tidak lagi tampak seperti tempat wisata yang terabaikan.\n" +
                    "\n" +
                    "Taman yang memiliki deretan gua ini dulunya merupakan tempat bermeditasi bagi para pemuka kerajaan atau prajurit keraton. Keaslian bangunan-bangunan batu kuno di Gua Sunyaragi bahkan masih terasa begitu murni hingga saat ini. Warga lokal juga sering menjadikan tempat wisata di Cirebon ini sebagai lokasi berburu foto.\n" +
                    "\n" +
                    "Taman Sari Gua Sunyaragi pun sering dijadikan lokasi pagelaran musik, sendratari, hingga pembukaan Festival Keraton Nusantara yang dilaksanakan setahun sekali. Bahkan, baru-baru ini, pengelola Taman Sari Gua Sunyaragi juga meluncurkan wahana balon udara untuk menarik minat wisawatan agar semakin betah berkunjung ke sini.\n" +
                    "\n" +
                    "Tertarik datang ke tempat wisata di Cirebon ini? Datang saja ke lokasinya di Jalan Sunyaragi, Kecamatan Kesambi, Cirebon. Taman Sari Gua Sunyaragi dibuka untuk umum setiap hari pada pukul 08:00-17:30.",

            "Taman Ade Irma Suryani (TAIS) dikenal sebagai taman hiburan anak pada dekade 90-an. TAIS sempat terabaikan sebelum akhirnya disulap menjadi waterpark yang diberi nama Cirebon Waterland. Sejak dibuka pada tahun 2014, tempat wisata di Cirebon yang satu ini langsung menjadi primadona pariwisata bagi warga Cirebon dan sekitarnya. Kehadiran pondok ikonik seperti yang terdapat di Dusun Bambu Lembang serta restoran bergaya kapal laut menjadi daya tarik bagi wisatawan, khususnya para pencinta fotografi.\n" +
                    "\n" +
                    "Selain pondok dan restoran yang ikonik, kolam renang waterboom Cirebon Waterland juga patut Anda jajal bersama si buah hati. Tempat wisata di Cirebon ini juga punya taman bermain anak yang dilengkapi berbagai wahana permainan dan spot foto menarik.\n" +
                    "\n" +
                    "Cirebon Waterland berlokasi di Jalan Yos Sudarso 1, Lemahwungkuk, Cirebon. Objek wisata satu ini dibuka setiap hari pada pukul 07:00-21:00 dengan harga tiket masuk seharga Rp50.000 dan Rp65.000 khusus akhir pekan.",

            "Cirebon juga punya destinasi wisata dengan pemandangan malam yang ciamik, namanya Bukit Gronggong. Bukit Gronggong merupakan lokasi nongkrong favorit anak muda Cirebon dan sekitarnya. Di kawasan Bukit Gronggong, Anda dapat menikmati indahnya pemandangan Cirebon pada malam hari dari ketinggian sambil duduk di bangku dan menikmati minuman hangat di tengah sejuknya cuaca perbukitan.\n" +
                    "\n" +
                    "Kini, di kawasan tempat wisata di Cirebon ini sudah banyak berdiri restoran dan penginapan yang menyajikan panorama perbukitan yang memesona. Jadi, liburan bersama keluarga dan sahabat pun bisa semakin menyenangkan. Buat Anda yang tertarik menikmati pemandangan malam khas Bukit Gronggong yang berlokasi di daerah Patapan, Beber, Cirebon, Anda hanya diharuskan membayar biaya parkir sebesar Rp2.000 untuk kendaraan roda dua, dan Rp5.000 untuk mobil.",

            "Telaga Remis menawarkan segarnya pemandangan alam khas kaki Gunung Ciremai untuk Anda yang ingin melepas penat dari padatnya aktivitas sehari-hari. Terletak sekitar 20 kilometer dari pusat Kota Cirebon, tepatnya di daerah Kaduela, Kuningan, Telaga Remis konon merupakan tempat pertapaan Raja Siliwangi pada masa lalu.\n" +
                    "\n" +
                    "Nama Telaga Remis yang dalam bahasa Sunda memiliki arti embun berasal dari kisah Prabu Siliwangi yang memanfaatkan embun sebagai air minumnya saat bertapa di daerah tersebut yang dulu terkenal tandus. Sang Prabu pun kemudian membuang sisa embun tersebut seraya berdoa agar kelak daerah tersebut menjadi telaga yang berguna bagi masyarakat sekitar.\n" +
                    "\n" +
                    "Nyatanya, doa Prabu Siliwangi tersebut menjadi kenyataan. Kini, Telaga Remis tak hanya mampu menjadi sumber mata air bagi warga sekitar, tapi juga telah disulap menjadi destinasi wisata yang mampu mendekatkan pengunjung pada alam. Di lahan seluas 3 hektare ini, Anda dapat menjelajahi kawasan hutan di sekitar telaga yang didiami ratusan jenis tumbuhan seperti pohon malaka, sonokeling, dan kosambi. Telaga Remis juga telah dilengkapi sejumlah fasilitas penunjang seperti camping ground, kamar mandi, warung, gazebo, dan lahan parkir.",

            "Warga setempat menyebut Setu Patok sebagai Danau Toba-nya Cirebon. Wajar saja, sebab Setu Patok bisa dinobatkan sebagai danau terbesar di wilayah Cirebon dan sekitarnya. Danau Setu Patok sering dijadikan sebagai tempat bersantai dan berburu foto bagi warga sekitar. Tempat wisata di Cirebon ini paling ramai dikunjungi pada sore hari berkat pemandangan sunset-nya yang indah.\n" +
                    "\n" +
                    "Pemandangan danau yang luas dan dikelilingi perbukitan bukan satu-satunya daya tarik yang dimiliki Setu Patok. Di tempat wisata di Cirebon yang satu ini, pengunjung dapat menjajal sejumlah kegiatan menarik seperti memancing, piknik, atau mengelilingi danau dari atas perahu motor. Akses menuju Setu Patok pun sangat mudah berkat lokasinya yang berada di jalur pantai utara kawasan Mundu dan hanya memakan waktu sekitar 30 menit berkendara dari pusat Kota Cirebon.",

            "Kawasan Trusmi terkenal akan deretan rumah perajin batik. Kini kawasan tersebut telah disulap menjadi destinasi wisata budaya yang diberi nama Sentra Batik Trusmi. Di sepanjang Jalan Trusmi tersebut, Anda akan disajikan beragam galeri batik khas Cirebon yang terkenal akan motif mega mendung dan coraknya yang cerah tapi lembut.\n" +
                    "\n" +
                    "Di kawasan tempat wisata di Cirebon ini, Anda tidak hanya dapat berburu oleh-oleh batik khas Cirebon. Beberapa galeri batik bahkan menawarkan kursus membatik bagi wisatawan yang tertarik mencoba menggambar motif batik khas Cirebon. Selain membatik, pengunjung juga akan diajak melukis topeng, sekaligus belajar menari topeng di kawasan wisata edukasi Sentra Batik Trusmi. Menarik, bukan?",

            "Cirebon mungkin tidak punya banyak tempat wisata alam seperti kawasan Kuningan atau Majalengka, sehingga kehadiran Wanawisata Ciwaringin mungkin dapat menjadi oasis bagi warga perkotaan Cirebon yang merindukan pemandangan hijau. Terletak di perbatasan Kabupaten Cirebon dan Majalengka, Wanawisata Ciwaringin menawarkan pemandangan hutan yang hijau sekaligus danau yang biasa dijadikan sebagai tempat memancing.\n" +
                    "\n" +
                    "Pemandangan gunung kapur yang gagah pun turut menambah daya tarik tempat wisata di Cirebon yang satu ini. Tak hanya itu, di kawasan Wanawisata Ciwaringin pun terdapat arena motorcross yang diperuntukkan bagi para pencinta tantangan. Tersedia pula sejumlah fasilitas pendukung seperti kamar mandi, lahan parkir, ruang ibadah, dan penginapan untuk memastikan kegiatan wisata pengunjung tetap nyaman.",

            "Hutan Plangon bisa jadi tempat wisata unik sekaligus keramat bagi warga Cirebon dan sekitarnya. Konon, hutan ini merupakan tempat menyepi dua pangeran keraton Cirebon. Banyak juga yang mengatakan bahwa dua pangeran tersebut disemayamkan di Hutan Plangon. Tidak heran jika banyak pula pengunjung yang datang ke Hutan Plangon untuk berziarah ke makam dua sesepuh Cirebon tersebut.\n" +
                    "\n" +
                    "Kawasan hutan yang terletak sekitar 3 kilometer dari pusat kota ini didiami ratusan ekor kera dan aneka ragam flora. Pengunjung yang datang ke tempat wisata di Cirebon ini dapat bercengkerama dengan kera-kera setempat atau sekadar memberi makanan. Namun, ingat, kebanyakan kera di Hutan Plangon agresif dan kurang ramah terhadap para pendatang. Jadi, usahakan untuk tetap berhati-hati dan tidak mengganggu habitat kera di sana, ya. Hutan Monyet Plangon berlokasi di Jalan Bumi Babakan Indah, Cirebon, dan dapat ditempuh dari pusat kota dalam waktu kurang lebih 45 menit.",

            "Warga Cirebon dan sekitarnya sering kali menjadikan tempat ini sebagai lokasi liburan bersama keluarga besar. Desa Wisata Cikalahang terkenal sebagai tempat ikan bakar yang punya pemandangan alam khas pegunungan. Pengunjung bahkan dapat menangkap ikan sendiri untuk diolah menjadi santapan lezat.\n" +
                    "\n" +
                    "Namun, jangan salah, meski terkenal sebagai lokasi memancing dan wisata kuliner, Desa Wisata Cikalahang tetap menawarkan sejumlah daya tarik wisata untuk setiap pengunjung. Kehadiran perahu wisata, pondokan, serta kolam renang dapat Anda jajal untuk menyemarakkan liburan bersama keluarga Anda.\n" +
                    "\n" +
                    "Desa Wisata Cikalahang terletak sekitar 2 kilometer dari Sumber, pusat pemerintahan Kabupaten Cirebon, tepatnya di Kecamatan Dukupuntang. Lokasinya pun berada tidak begitu jauh dari Telaga Remis dan dapat dijangkau dengan mudah oleh kendaraan pribadi.",

            "Pantai Kejawanan bisa menjadi tempat wisata di Cirebon alternatif bagi Anda yang merindukan suasana semilir pantai dan deburan air laut. Meski kondisinya relatif kurang terawat jika dibandingkan dengan pantai lain seperti yang ada di Bali, banyak warga yang menghabiskan sore di Pantai Kejawanan untuk sekadar bersantai di pinggir laut sambil menikmati kopi dan camilan.\n" +
                    "\n" +
                    "Anda pun dapat menaiki perahu motor untuk mengelilingi area Pantai Kejawanan hanya dengan membayar ongkos sewa sebesar Rp15.000-Rp20.000 saja. Pantai Kejawanan juga punya beberapa spot menarik yang dapat dijadikan sebagai objek foto Anda.",

            "Kawasan Alun-alun Kejaksan merupakan tempat nongkrong favorit warga Kota Cirebon. Saat malam, kedai makanan dan minuman banyak buka berderet di sepanjang tempat wisata di Cirebon ini. Hiasan kelap-kelip lampu pun turut menambah semarak suasana malam di alun-alun.\n" +
                    "\n" +
                    "Kawasan alun-alun juga sering dijadikan lokasi jogging berkat lahannya yang luas. Setiap hari Minggu, Alun-alun Kejaksan dan sepanjang Jalan Siliwangi dipadati pengunjung yang ingin menghabiskan Minggu paginya di acara car free day.\n" +
                    "\n" +
                    "Tepat di sebelah alun-alun terdapat Masjid Raya At-Taqwa yang merupakan masjid terbesar di Kota Cirebon. Masjid satu ini pun kerap disambangi wisatawan untuk beribadah atau bahkan melihat pemandangan Cirebon dari atas menaranya."
    };

    private static int[] cirebonTourismPic = {
            R.drawable.keraton_kasepuhan,
            R.drawable.keraton_kanoman,
            R.drawable.masjid_agung_sang_cipta_rasa,
            R.drawable.makam_sunan_gunung_jati,
            R.drawable.taman_sari_gua_sunyaragi,
            R.drawable.cirebon_waterland_taman_ade_irma_suryani,
            R.drawable.bukit_gronggong,
            R.drawable.telaga_remis,
            R.drawable.setu_patok,
            R.drawable.sentra_batik_trusmi,
            R.drawable.wanawisata_ciwaringin,
            R.drawable.hutan_plangon,
            R.drawable.desa_wisata_cikalahang,
            R.drawable.pantai_kejawanan,
            R.drawable.alun_alun_kejaksan
    };

    static ArrayList<CirebonTourism> getListData() {
        ArrayList<CirebonTourism> list = new ArrayList<>();
        for (int position = 0; position < cirebonTourismName.length; position++) {
            CirebonTourism cirebonTourism = new CirebonTourism();
            cirebonTourism.setName(cirebonTourismName[position]);
            cirebonTourism.setInfo(cirebonTourisminfo[position]);
            cirebonTourism.setPic(cirebonTourismPic[position]);
            list.add(cirebonTourism);
        }
        return list;
    }
}
