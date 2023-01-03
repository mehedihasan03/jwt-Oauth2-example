## keypair.pem

	openssl genrsa -out keypair.pem 2048

## public.pem

	openssl rsa -in keypair.pem -pubout -out public.pem

## private.pem

	openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem