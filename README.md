📘 README: Computer Networks P2P File Sharing Project
🧠 Project Description
This project implements a BitTorrent- [x] Java source code in /src



Peers exchange:

Handshake messages to verify identity

Bitfield messages to communicate available pieces

Interested/Not Interested to indicate download interest

Choke/Unchoke messages every p seconds

Optimistic unchoke every m seconds

Request, Piece, and Have messages during file download

The system terminates when all peers have received the full file.

🗂️ Folder Structure
Project/
├── config/
│   ├── PeerInfo.cfg       # Peer IDs, ports, and file availability
│
├── src/                   # Java source code
│   ├── peerProcess.java
│   ├── PeerHandler.java
│   ├── Bitfield.java
│   ├── Message.java
│   ├── MessageType.java
│   ├── Handshake.java
│   ├── Logger.java
│
├── log/                   # Logs per peer
│   ├── log_peer_1001.log
│   ├── log_peer_1002.log
│   ├── log_peer_1003.log
▶️ How to Run the Project
🧩 1. Save this content in PeerInfo.cfg under /config:
1001 localhost 6008 1
1002 localhost 6009 0
1003 localhost 6010 0
⚙️ 2. Compile the Java code:
cd "C:\Users\Sri Ashritha A\OneDrive\Desktop\4-2SEM\CN\Project"
javac src/*.java
🚀 3. Start peers in separate terminals:
java -cp src peerProcess 1001
java -cp src peerProcess 1002
java -cp src peerProcess 1003
📄 4. Check logs in /log/ folder:
log/log_peer_1001.log
log/log_peer_1002.log
log/log_peer_1003.log
✅ What the Demo Shows (Grading Rubric)
1️⃣ Start the peer processes (35%)
✅ Reads PeerInfo.cfg

✅ Sets file availability flags

✅ Establishes TCP connections

2️⃣ After connection (30%)
✅ Handshake and bitfield exchange

✅ Sends interested or not interested

✅ Choke/unchoke logic every p seconds

✅ Optimistic unchoke every m seconds

3️⃣ File exchange (30%)
✅ Request, Have, Interested, Piece messages

✅ Bitfield updates

4️⃣ Stop service (5%)
✅ Peer terminates when all have complete file

✅ All messages logged to log_peer_<id>.log

👥 Team
Sri Ashritha Appalchity

📎 Submission Checklist


🎥 Video Demo Link:
📎 [Insert your OneDrive or Canvas link here]

Let me know if you need a final zip packaging or a walkthrough video script!

