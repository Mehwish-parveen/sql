try {
            Connection conn;
            String dbURL = "jdbc:postgresql://127.0.0.1:5432/new_db";
            String userName = "postgres";
            String password = "arslan123";
            conn = DriverManager.getConnection(dbURL, userName, password);
            String query = "select * from mehwish.\"Cities\" ";
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
               String value1 = rs.getString("city_name");
               cityName_Combobox.addItem(value1);  //add city names to the list

            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
             
        }
        
        
    }
