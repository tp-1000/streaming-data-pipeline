# Overview

By now you've seen some different Big Data frameworks such as Kafka and Spark. Now we'll be focusing in on HBase. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like


### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions
#### What is a NoSQL database? 
It is a database that does not have to adhere to relational database model (multiple tables that have records that relate to another table). Data can be stored in ways the is better suited for 
retrieval or writing making it different from what a traditional relational database may offer.

#### In your own words, what is Apache HBase? 
It is a distributed database (existing across multiple nodes). It works with HDFS (hadoop distributed file system or similar)
It is a NoSQL database.
Basically four types of NoSQL - 
1) Key Value
2) Document-based
3) Column-based
4) Graph-based

#### What are some strengths and limitations of HBase? 
* [HBase By Examples](https://sparkbyexamples.com/apache-hbase-tutorial/)
Strength - storage options can be tailored to the data  
Better read/write preference for high volume and size of data  
Cost effective horizontal scaling.  

s - lots of data (millions or billions of rows)
s - scales horizontal
s - random selects and scans by key
s - variable schema
w - 
s - automatic partitioning
s - scale automatially
s - fault tolerance
s - mapreduce destibuted processing


HDFS->HBASE->Zookeeper->JavaAPI->tools

Weakness - data can be stored using an inefficient modeled negating performance benefits.
It lacks the consistency of the relational database 

master (managed by zookeeper)
region server ( one or more, region subset of region rows)
master is responsible for schema

partitioning - table is horizontally partioning 
Percistance and data availability - stores in HDFS 

#### Explain the following concepts: 
* Rowkey - tables are sorted by row keys for column families
* Column Qualifier - many qualifiers for each column family
* Column Family - any number of columns 

these are combined with timestamp to get a particular value


#### What are the differences between Get and Put commands in HBase? 
* [HBase commands](https://www.tutorialspoint.com/hbase/hbase_create_data.htm)
get contents of row or cell
put value in row or cell

#### What is the HBase Scan command for? 
* [HBase Scan](https://www.tutorialspoint.com/hbase/hbase_scan.htm)

#### What was the most interesting aspect of HBase when went through all the questions? 