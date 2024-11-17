//package services;
//
//import java.util.List;
//
//import com.datastax.driver.core.ResultSet;
//import com.datastax.driver.core.Row;
//import com.datastax.driver.core.Session;
//
//import model.ModelLog;
//
//public class CassandraServies {
//	Session session;
//	private static final String TABLE_NAME = "pageviewlog";
//	
//	public CassandraServies(Session session) {
//		this.session = session;
//		createTable();
//	}
//	
//	private void createTable() {
//		StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
//			      .append(TABLE_NAME).append("(")
//			      .append("guid int PRIMARY KEY, ")
//			      .append("timeCreate date,")
//			      .append("browserCode int,")
//			      .append("browserVer text,")
//			      .append("osCode int,")
//			      .append("osVer text,")
//			      .append("ip int,")
//			      .append("domain text,")
//			      .append("path text,")
//			      .append("cookieCreate date,")
//			      .append("cId int,")
//			      .append("siteId int,")
//			      .append("referer text,")
//			      .append("locId int,")
//			      .append("flashVersion text,")
//			      .append("jre text,")
//			      .append("sr text,")
//			      .append("sc text,")
//			      .append("geographic int,")
//			      .append("category text);");
//		String querry = sb.toString();
//		session.execute(querry);
//	}
//	
//	public void addData(ModelLog model) {
//		StringBuilder sb = new StringBuilder("INSERT INTO ")
//				.append(TABLE_NAME).append("(")
//				.append("guid, ")
//				.append("timeCreate, ")
//				.append("browserCode, ")
//				.append("browserVer, ")
//				.append("osCode, ")
//				.append("osVer, ")
//				.append("ip, ")
//				.append("domain, ")
//				.append("path, ")
//				.append("cookieCreate, ")
//				.append("cId, ")
//				.append("siteId, ")
//				.append("referer, ")
//				.append("locId, ")
//				.append("flashVersion, ")
//				.append("jre, ")
//				.append("sr, ")
//				.append("sc, ")
//				.append("geographic, ")
//				.append("category)")
//				.append(" VALUE (")
//				.append(model.getGuid()).append(", ")
//				.append(model.getTimeCreate()).append(", ")
//				.append(model.getBrowserCode()).append(", ")
//				.append(model.getBrowserVer()).append(", ")
//				.append(model.getOsCode()).append(", ")
//				.append(model.getOsVer()).append(", ")
//				.append(model.getIp()).append(", ")
//				.append(model.getDomain()).append(", ")
//				.append(model.getPath()).append(", ")
//				.append(model.getCookieCreate()).append(", ")
//				.append(model.getcId()).append(", ")
//				.append(model.getSiteId()).append(", ")
//				.append(model.getReferer()).append(", ")
//				.append(model.getLocId()).append(", ")
//				.append(model.getFlashVersion()).append(", ")
//				.append(model.getJre()).append(", ")
//				.append(model.getSr()).append(", ")
//				.append(model.getSc()).append(", ")
//				.append(model.getGeographic()).append(", ")
//				.append(model.getCategory()).append(");");
//		
//		String querry = sb.toString();
//		session.execute(querry);
//	}
//	
//	public void showData() {
//		String querry = "select * from " + TABLE_NAME;
//		ResultSet result = session.execute(querry);
//		
//		List<Row> rows = result.all();
//		if(rows == null || rows.size() == 0) {
//			System.out.println("NO DATA IN TABLE!");
//			return;
//		}
//		
//		for(Row row : rows) {
//			System.out.println(row.toString());
//		}
//	}
//	
//}
