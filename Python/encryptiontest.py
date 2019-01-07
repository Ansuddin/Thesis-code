from matrix_client.client import MatrixClient
from matrix_client.crypto.olm_device import OlmDevice

host = "https://ansuddin.xyz"
user_id = "@ans:ansuddin.xyz"
password = "test"
#device_id = "device_id"
room_id = "!fLhiSuTZAupSQpcEXs:ansuddin.xyz"

client = MatrixClient(host, encryption=True)

token = client.login_with_password(username="ans", password="test")

room = client.join_room(room_id)


if not room.encrypted:
    room.send_text("Unencrypted!")
    room.enable_encryption()
    room.send_text("Encrypted, if we had the required power level.")

if room.encrypted:
	room.send_text("Success!")