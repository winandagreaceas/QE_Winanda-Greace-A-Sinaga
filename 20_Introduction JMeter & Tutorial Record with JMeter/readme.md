(20) Introduction JMeter & Tutorial Record with JMeter

1. JMeter (Apache JMeter) merupakan sebuah perangkat lunak open-source yang dirancang untuk membuat uji perilaku fungsional serta mengukur kinerja situs web. Pros of Apache JMeter yaitu Open Source dan Easy to use GUI/Non-GUI.
2. Adapun Komponen dari Script JMeter ialah:
   a. Test Plan yang merupakan rencana besar tes yang akan dilakukan (parent).
   b. Thread Groups merupakan sekelompok utas untuk menjalankan skenario yang serupa.
   c. Sampler yang merupakan request yang dikirimkan ke server.
   d. Config Elements yang digunakan untuk melakukan config ataupun modifikasi terhadap sampler request yang dikum ke server.
   e. Listener yang merupakan perekam data yang dihasilkan dan diuji.
   f. Timers Fitur yang dijalankan terlebih dahulu sebelum keseluruhan fitur lain yang sedang berjalan.
   g. Assertions yang merupakan kriteria taambahan apakah passed or failed.
   h. Pre-Processors yang merupakan fitur yang akan memproses response data sebelum pengujian.
   I. Post-Processors yang merupakan fitur yang akan memproses response data sesudah pengujian.
3. Instalasi JMeter dapat dilakukan dengan melakukan instalasi terhadap tools terlebih dahulu, lalu membuka terminal untuk menjalankan aplikasi, dan melakukan instalasi plugin.
   a. Install Tools
     - Install JDK
     - Search JMeter
     - Download File (.zip)
     - Open File
   b. Open Terminal
    - Navigate to the bin folder
    - Run JMeter.bat
   c. Install Plugin
    - Search Plugin
    - Download file .jar
    - Open directory Jmeter Open directory Jmeter and navigate to lib/ext directory
    - Move file. jar Move file plugin-manager.jar into lib/et in JMeter directory
    - Restart
