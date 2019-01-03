from matrix_client.client import MatrixClient

host = "https://ansuddin.xyz"
user_id = "@ans:ansuddin.xyz"
password = "test"
room_id = "!fLhiSuTZAupSQpcEXs:ansuddin.xyz"

client = MatrixClient(host)

token = client.login_with_password(username="ans", password="test")

room = client.join_room(room_id)

while True:
        try:
            get_input = raw_input
        except NameError:
            get_input = input
        msg = get_input()
        if msg == "/quit":
            break
        else:
            room.send_text(msg)


