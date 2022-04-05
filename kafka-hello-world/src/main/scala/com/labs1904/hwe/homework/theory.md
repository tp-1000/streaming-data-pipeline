# Overview

Kafka has many moving pieces, but also has a ton of helpful resources to learn available online. In this homework, your
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
#### What problem does Kafka help solve? Use a specific use case in your answer 
* Helpful resource: [Confluent Motivations and Use Cases](https://youtu.be/BsojaA1XnpM)
Kafka helps to solve the issue of digesting incoming data. Infomation is added to a topic and read from the queue.
Event Driven (date is now a stream) Newspaper Snapshot vs newsfeed. Store events and consume in real time.
The move from data as an object to data as an event requires a whole platform to support the new model.
Kafka is a "distributed log". Batch old (slow) -> Event driven (immediate). 
#### What is Kafka?
Kafka is an tool for getting streaming events into a place where they can be further precessed.
* Helpful resource: [Kafka in 6 minutes](https://youtu.be/Ch5VhJzaoaI) 

#### Describe each of the following with an example of how they all fit together: 
 * Topic - a bucket for publishing messages to or consuming message from. 
 * My transaction generates an event that is written to a Topic and that event is consumed
 * Producer - part that writes to the topic
 * Consumer - part that ingests the topics events
 * Broker - a single kafka sever (consumer and producers opperate thought the broker)
 * Partition - a subdivision of a topic (timing only guaranteed withing a partition)

#### Describe Kafka Producers and Consumers
Producers write messages or data stream events. Consumers ingest and process the messages.
#### How are consumers and consumer groups different in Kafka? 
* cunsumer is what is streaming the message for processing. A consumer group allows this to scale hoizontally
* it also adds fault tolerance bcasue other consumers in the group can take over
* they communicate to ensure a message is only read once.
* Helpful resource: [Consumers](https://youtu.be/lAdG16KaHLs)
* Helpful resource: [Confluent Consumer Overview](https://youtu.be/Z9g4jMQwog0)

#### How are Kafka offsets different than partitions? 
ofset is how a consumer keeps track of where it was reading. The offset is the index the message can be found at.
A partition is a collection of message within a topic. They can be distributed across clusters and ensure that the order of 
messages is garenteede to be chronological for messages within the partitions. Not sure if the higher the offset the new the message?
And how does it handle when messages expire.

#### How is data assigned to a specific partition in Kafka? 
it is distributed uniformly across all partitions but can also be written to a specific partition.

#### Describe immutability - Is data on a Kafka topic immutable? 
Not sure... it seems like it wouldn't function if it wasn't. There are modles
where kafka writes back to itself but this no changing the existing data

#### How is data replicated across brokers in kafka? If you have a replication factor of 3 and 3 brokers, explain how data is spread across brokers
* Helpful resource [Brokers and Replication factors](https://youtu.be/ZOU7PJWZU9w)

#### What was the most fascinating aspect of Kafka to you while learning? 
That it is opensource. Its use cases and how teh shift to realtime processing has change the information game.

#### CAP 
consistency availability partition tolerance. The theory goes you can get good performance for two of the three
but not all three 