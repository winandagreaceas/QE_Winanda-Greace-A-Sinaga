(21) Post Processor & Understanding JMeter Results

1. Post Processor merupakan bagian dari Test Plan dimana merupakan sebuah aksi yang berjalan ketika proses request pada sebuah halaman web selesai dilakukan. Post Processor bertujuan untuk mengolah data yang terdapat pada response data dengan menggunakan JSON Extractor.
Proses request tersebut pada umumnya, mengekstrak value yang didapatkan dari hasil mengakses halaman sebuah web, seperti data-data pada JSON. Pada **JSON Extractor** terdapat **Json Path digunakan untuk ekstrak isi dari json response dari** nilai yang terdapat dari data JSON yang dihasilkan dari respons saat kita melakukan request.

3. JSON Path digunakan untuk mengekstrak isi dari JSON Response. Berikut beberapa ekspresi umum yang digunakan pada JSON Path:
   a. $ : root element
   b. . : child operator (_object_)
   c. [] : child operator (_array_)
   d. .. = recursive descent (langsung pada objek)
   e. = : wildcard (all things)
   f. [start:end] = array slice operator borrowed

5. Seperti yang sudah dijelaskan pada summary (20) bahwa untuk "Open JMeter" hanya perlu open terminal, navigate to bin folder, dan run JMeter. Selain itu, terdapat beberapa jenis report seperti Summary Report, Aggregate Report, dan Throughput = (number of requests) / (total time) * conversion.
Dimana untuk Throughput;
a. number of requests = number of executed requests.
b. total time = (lastSampleStartTime + lastSampleLoadTime – firstSampleStartTime).
c. conversion : the the unit of conversion value, example 1000 will convert the value to the second, 1000*60 will convert the value to the minute, etc. 
