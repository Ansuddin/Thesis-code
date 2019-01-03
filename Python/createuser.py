from matrix_client.client import MatrixClient

client = MatrixClient("ansuddin.xyz")
token = client.register_with_password(username="test",
    password="test")
