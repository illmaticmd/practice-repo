import pyodbc 
cnxn = pyodbc.connect('Driver={ODBC Driver 18 for SQL Server};Server=tcp:mcdesmond.database.windows.net,1433;Database=Logistics;Uid=illmaticmd;Pwd=Solid367!;Encrypt=yes;TrustServerCertificate=no;')

cursor = cnxn.cursor()
cursor.execute("INSERT INTO VaultUpdateTrial (UpdateTime) VALUES (SYSDATETIME())")

'''cursor = cnxn.cursor()'''	


cursor.execute("SELECT * FROM VaultUpdateTrial") 
row = cursor.fetchone() 
while row:
    print (row) 
    row = cursor.fetchone()

cnxn.commit()

#Connection Timeout=30;