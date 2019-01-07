from matrix_client.client import MatrixClient

client = MatrixClient("https://ansuddin.xyz")

token = client.login_with_password(username="ans", password="test")


room = client.join_room("!fLhiSuTZAupSQpcEXs:ansuddin.xyz")

room.send_text("python3")
