package jp.co.axiz.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/comic_ecsite_web", "postgres", "axiz");
		} catch (Exception e) {
			// 本来は専用の例外クラスを作成したほうがよい
			throw new RuntimeException(e);
		}
	}
}
