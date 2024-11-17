//package services;
//
//import com.datastax.driver.core.Cluster;
//import com.datastax.driver.core.Cluster.Builder;
//import com.datastax.driver.core.Session;
//
//public class CassandraConnect {
//	private Cluster cluster;
//	private Session session;
//	
//	public void connect(String node, Integer port) {
//		Builder builder = Cluster.builder().addContactPoint(node);
//		if(port != null) {
//			builder.withPort(port);
//		}
//		
//		cluster = builder.build();
//		session = cluster.connect("trannguyenhan");
//	}
//
//	public Session getSession() {
//		return session;
//	}
//	
//	public void close() {
//		cluster.close();
//		session.close();
//	}
//}
