package com.mapreduce, java,
import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable,
import org.apache.hadoop.io. Long Writable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred. Reporter,
public class WC Mapper extends MapReduceBase implements Mapper Long Writable, Text, Text, Int Writable>
private final static Int Writable one new IntWritable(1);
private Text word new Text();
public void map(LongWritable key, Text value OutputCollector Text.IntWritable output
Reporter reporter) throws IOException
String line value.toString();
StringTokenizer tokenizer = new StringTokenizer(line);
while (tokenizer.hasMoreTokens())
word.set(tokenizer.nextToken());
output.collect(word, one);
