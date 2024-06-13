package com.mapreduce.java;
import java.io.IOException;
import java.util.Iterator,
import org.apache.hadoop.io.Int Writable;
import org.apache.hadoop.io.Text,
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer:
import org.apache.hadoop.mapred. Reporter,
public class WC Reducer extends MapReduceBase implements
Reducer Text,IntWritable, Text, Int Writable>
public void reduce(Text key, Iterator Int Writable values, OutputCollector Text, IntWritable> output, Reporter reporter) throws IOException
int sum-0;
while (values.hasNext())
mum values.next().get();
output.collect(key.new IntWritable(sum));
