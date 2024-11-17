package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
//
//import com.datastax.driver.core.Session;

import com.datastax.spark.connector.cql.CassandraConnector;
import com.datastax.spark.connector.cql.CassandraConnectorConf;

import model.ModelLog;
//import services.CassandraConnect;
//import services.CassandraServies;

public class MMain {
	public static void main(String[] args) {
//		Session session;
//		CassandraConnect client = new CassandraConnect();
//		client.connect("127.0.0.1", 9042);
//		
//		session = client.getSession();
//		CassandraServies cassandra = new CassandraServies(session);
		
		SparkConf conf = new SparkConf();
		JavaSparkContext sc = new JavaSparkContext(conf);
		CassandraConnector cassandra = CassandraConnector.apply(sc.getConf());
		
		SparkSession spark = SparkSession.builder().appName("Read file HDFS").master("local").getOrCreate();
		Dataset<Row> parquetFile = spark.read().parquet("hdfs://127.0.0.1:9001/usr/trannguyenhan/pageviewlog");

//
//		parquetFile.printSchema();
//
//		List<ModelLog> listModelLog = new ArrayList<ModelLog>();
//		List<Row> listRow = parquetFile.collectAsList();
//		for (Row row : listRow) {
//			Date timeCreate = new Date(20);
//			Date cookieCreate = new Date(4);
//			int browserCode = row.getInt(0);
//			String browserVer = row.getString(1);
//			int osCode = row.getInt(12);
//			String osVer = row.getString(14);
//			long ip = row.getLong(9);
//			int locId = row.getInt(11);
//			String domain = row.getString(5);
//			int siteId = row.getInt(18);
//			int cId = row.getInt(2);
//			String path = row.getString(15);
//			String referer = row.getString(16);
//			long guid = row.getLong(8);
//			String flashVersion = row.getString(6);
//			String jre = row.getString(10);
//			String sr = row.getString(19);
//			String sc = row.getString(17);
//			int geographic = row.getInt(7);
//			String category = row.getString(3);
//			String osName = row.getString(13);
//
//			ModelLog model = new ModelLog(timeCreate, browserCode, browserVer, osName, osCode, osVer, ip, domain, path,
//					cookieCreate, guid, siteId, cId, referer, geographic, locId, flashVersion, jre, sr, sc, category);
//			
//			System.out.println(model);
//			cassandra.addData(model);
//			listModelLog.add(model);
//		}
//		
//		cassandra.showData();
//		client.close();

	}
}
