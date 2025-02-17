# Java tech exercise

1. Retrieve a list a person from a CSV file and display it to the console.
2. Save it to the database.
3. Implement getAllPersons endpoint
4. Implement get one person endpoint

Questions:

- Now you have to delete a record but business want to keep a trace of it. How would you do it?
- How would you optimize the retrieval of a person when dealing with millions of records?
- What database indexing strategies would you use for efficient lookups?
- How do you manage retries and fallbacks in case of external system failures?
- How would you secure the API endpoints?
- Would you consider separating the CSV processing and API service into different microservices? Why?
- Instead of inserting directly into the database, how would you use message queues (Kafka, RabbitMQ) for better
  scalability?
- How would you implement pagination for retrieving a list of persons?
- How would you monitor and log API performance?