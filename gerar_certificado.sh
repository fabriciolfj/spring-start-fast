keytool -genkeypair -alias test -keyalg RSA -keysize 4096 \
  -validity 3650 -dname "CN=localhost" -keypass abc123 -keystore keystore.p12 \
  -storeType PKCS12 -storepass abc123