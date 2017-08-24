package com.org.sparkstreaming.kafka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

import scala.Tuple2;

public class StreamKafka {

	private static final Pattern SPACE = Pattern.compile(" ");
	
	private static final String KAFKA_TOPIC = "fnbf-test";
	
	private static final String CONSUMER_GROUP = "fnbf-group";

	  private StreamKafka() {
	  }

	  public static void main(String[] args) throws Exception {
	    /*if (args.length < 4) {
	      System.err.println("Usage: JavaKafkaWordCount <zkQuorum> <group> <topics> <numThreads>");
	      System.exit(1);
	    }*/
	    
	    SparkConf sparkConf = new SparkConf().setAppName("JavaKafkaStreamWordCount");
	    // Create the context with 2 seconds batch size
	    JavaStreamingContext jssc = new JavaStreamingContext(sparkConf, new Duration(2000));

	    int numThreads = 2;//Integer.parseInt(args[3]);
	    Map<String, Integer> topicMap = new HashMap<>();
	      topicMap.put(KAFKA_TOPIC, numThreads);

	    JavaPairReceiverInputDStream<String, String> messages =
	            KafkaUtils.createStream(jssc, "localhost:2181", CONSUMER_GROUP, topicMap);

	    JavaDStream<String> lines = messages.map(Tuple2::_2);
 
	    JavaDStream<String> words = lines.flatMap(x -> Arrays.asList(SPACE.split(x)));

	    JavaPairDStream<String, Integer> wordCounts = words.mapToPair(s -> new Tuple2<>(s, 1))
	        .reduceByKey((i1, i2) -> i1 + i2);

	    wordCounts.print();
	    jssc.start();
	    jssc.awaitTermination();
	  }

}
