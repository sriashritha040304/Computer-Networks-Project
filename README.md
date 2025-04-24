📘 README: Computer Networks P2P File Sharing Project

🧠 PROJECT DESCRIPTION
This project implements a BitTorrent-style Peer-to-Peer (P2P) file sharing system in Java. Each peer communicates using custom message types over TCP and follows a specified protocol to share pieces of a file among a network of peers.

Peers exchange:
- Handshake messages to verify identity
- Bitfield messages to communicate available pieces
- Interested/Not Interested to indicate download interest
- Choke/Unchoke messages every p seconds
- Optimistic unchoke every m seconds
- Request, Piece, and Have messages during file download

The system terminates when all peers have received the full file.

────────────────────────────────────────

🗂️ FOLDER STRUCTURE

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

────────────────────────────────────────

▶️ HOW TO RUN THE PROJECT

🧩 1. Save this content in config/PeerInfo.cfg:
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

────────────────────────────────────────

✅ WHAT THE DEMO SHOWS (GRADING RUBRIC)

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

────────────────────────────────────────

👥 TEAM
- Sri Ashritha Appalchity

────────────────────────────────────────

📎 SUBMISSION CHECKLIST
- [x] Java source code in /src
- [x] Config files in /config
- [x] Logs in /log
- [x] README + Video demo

🎥 VIDEO DEMO LINK:
[Insert your OneDrive or Canvas link here]
