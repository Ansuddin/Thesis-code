import time
from matrix_client.client import MatrixClient

host = "https://ansuddin.xyz"
user_id = "@ans:ansuddin.xyz"
password = "test"
#device_id = "device_id"
room_id = "!fLhiSuTZAupSQpcEXs:ansuddin.xyz"


client = MatrixClient(host)
token = client.login_with_password(username="ans", password="test")

def on_invite(room_id, state):
        print("received invite");
        print ("joining room " + room_id)
        room = client.join_room(room_id)


client.add_invite_listener(on_invite)
client.start_listener_thread()

while(True):
	time.sleep(5)
