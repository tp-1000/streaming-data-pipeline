# Overview

Similar to the work you did for Kafka, this is your crash course into Spark through different questions. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like
* Spark By Examples is a great resources to start with - [Spark By Examples](https://sparkbyexamples.com/)

### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions

---

### What problem does Spark help solve? Use a specific use case in your answer 
Spark helps solve the issue of efficiently processing large amount of data.
Spark is used in the banking industry to analyze transactions in near realtime to detect things like fraud.


* Helpful resources: [Apache Spark Use Cases](https://www.toptal.com/spark/introduction-to-apache-spark) and [Overivew of Apache Spark](https://www.youtube.com/watch?v=znBa13Earms&t=42s)

---

### What is Apache Spark?  
Apache Spark is a distributed data processing framework. It supports (near) realtime processing. It is flexible and has APIs for multiple languages and can be implemented as a full Spark based application or integrated into another application.  


* Helpful resource: [Spark Overview](https://www.youtube.com/watch?v=ymtq8yjmD9I) 

---

### What is distributed data processing? How does it relate to Apache Spark?  
  
Distributed data processing uses multiple nodes or cores run parallel process on data. This can be very efficient in terms of speed. Spark is a distributed data processing framework.


* Helpful resource: [Apache Spark for Beginners](https://medium.com/@aristo_alex/apache-spark-for-beginners-d3b3791e259e)

---

### On the physical side of a spark cluster, you have a driver and executors. Define each and give an example of how they work together to process data.
* Driver  
Drives process RDD. They Create a spark context and makes a plan which the Cluster manager schedules on the Worker nodes. 
An action is preformed on an RDD. The driver examines the request and decides how it should be processed, building a game plan. 
Driver hands off these instructions to the Cluster Manager which causes worker nodes to dynamically create executors to handle the processing. 
Executors return the results back to the Driver.    
* Executors  
The executor are on worker nodes and are dynamically launched. The results of the work are sent back to the driver. 
Executors are responsible for the processing. The closer the data is to the executor the more efficiently it can process that data.

---

### Define each and explain how they are different from each other 
* RDD (Resilient Distributed Dataset)  
RDD is a collection of read only objects (immutable) split across the cluster. The details of the RDD are abstracted way and the Spark framework handles processing them.
RDD does in memory processing which is faster than disk reads. Does not take advantage of Spark optimization.
Has compile-time type safety.
* DataFrame  
Immutable data structure. Conceptually a table in a relational database with columns. Allows for Spark optimization. Only works with structured and semi structured data.
* DataSet  
Dataset is a blend of both RDD and Dataframes. They offer type safety and an object-oriented programming interface like RDD but also Spark optimization. 
It can handle both structured and unstructured data. Has compile-time type safety.


* Helpful resource: [RDD vs Dataframe vs Dataset API](https://data-flair.training/blogs/apache-spark-rdd-vs-dataframe-vs-dataset/)

---

### What is a spark transformation?
This sets or returns a new dataset. Only triggered by the execution of an action.

Similar idea. When Java is compiled the variables can begin using system resources. This sounds similar to Transformations and Actions.  
The transformation is just an intention until a job is triggered by an action. System resources to hold the dataset and processing does not happen until an action kicks it off.

* Helpful resource: [Spark By Examples-Transformations](https://sparkbyexamples.com/apache-spark-rdd/spark-rdd-transformations/)

---

### What is a spark action? How do actions differ from transformations? 
An action can be performed on a RDD. At that point a new job is started and the RDD. Example actions reduce, first, and foreach. 

---

### What is a partition in spark? Why would you ever need to repartition? 
A partition is a way to organize data. Sparl partitions allow for parallel processing which is necessary to efficiently with large datasets. A job can run on each partition.
A partition can be set up manually for a "state" column in US census data. Generating 50 partitions.
In a distributed environment having good data distribution is important. Repartitioning can help redistribute the data throughout the system but at a cost.
By default, Spark handles partitions creation and distribution automatically.

* Helpful resource: [Spark Partitioning, speed, and Parallelism](https://www.projectpro.io/article/how-data-partitioning-in-spark-helps-achieve-more-parallelism/297)

---

### What was the most fascinating aspect of Spark to you while learning? 
The idea of distributed processing.

Cool feature.
Spark has a shell (REPL) component which can speed up the development process by not having to code the full context and still perform spark processing.
Use the [shell](https://mungingdata.com/apache-spark/using-the-console/) to follow along and learn about [dataframes](https://mungingdata.com/apache-spark/introduction-to-dataframes/)







---
---
---
### Rough notes
It can take advantage of multiple machines or multiple cores on a desktop.
"Communication is very expensive in distributed programming"

Multi cluster, parallel processing, Apache spark creates distributed datasets and eficently allocates resources for process and working with the datasets


NOTES: (RDD is taken care of behind the sences) driver is responsible for "context" and builds game plan which is sent to cluster manager. From there it goes to the appropraite worker nodes.
Context is the entry point of the data into the spark process.



**in-memory** computing framework
realtime and batch  
across cluster   
add spark to your application or build spark based application
very efficient
Resilient distributed data set (makes it very fast)
in memory computing. (not caching which load ahead)
flexible (python, scala, java)
fault-tolerant (RDD)
Has built in Analytics
Spark components (core, sql, steaming, MLib, GraphX-network-based-data)
core




(to exextutor
processing is done in memory
under the hood is hidden
driver makes spark context
cluster mananger - DAG schedulater
worker nodes sends results back to the diver. 


(downside high amount of RAM needed to do in mem processing)

Once you have a RDD then you can either *Transformation* or *Action*  
Transformation just sets up new RDD but that is not executed  
until and action is Invoked.
memory management
fault-tolerant
interacts with storage systems
monitors jobs
sql
Used to process semi or structured data processing
SQLcontext - the way to get RDD (the entry point that makes data available for processing)  
Streaming
cameras in store watching customers to generate custom offers in real time
input steam -> spark streaming -> process in smaller peices -> then stored.
MLib
eases the deployment and deploymnet of MAchine learning based algarythems
GraphX
Process graph based data. Data that is related to other data as in parts of a network (Think facebook)

Spark Standalone mode - rely on external storage 
