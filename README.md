# Java Socket Server Performance Comparison

[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

A Java Socket programming project comparing three server architectures with Apache JMeter performance testing.

## 🎯 Overview

This project demonstrates the performance differences between:
1. **Basic TCP Server** - Single-threaded, blocks on each request
2. **Multi-threaded Server** - Creates one thread per client
3. **Thread Pool Server** - Uses fixed thread pool for scalability

## 📁 Project Structure

```
├── Basic_TCP_Server_Client/     # Single-threaded server
├── MultiThreaded_Server_Client/ # Thread-per-client server
├── ThreadPool_Server/           # Thread pool server
└── View_Results_in_Table.jmx    # JMeter test plan
```

## 🚀 Quick Start

### Running Servers

1. **Compile and run any server:**
   ```bash
   javac Server.java Client.java
   java Server
   # In another terminal
   java Client
   ```

2. **Default configuration:** `localhost:8020`

### Load Testing with JMeter

1. **Open JMeter and load test plan:**
   ```bash
   jmeter -g
   # File → Open → View_Results_in_Table.jmx
   ```

2. **Run test:**
   - Start your server first
   - Click "Start" button in JMeter
   - View results in Summary Report

## 📊 Performance Comparison

| Server Type | Throughput | Scalability | Resource Usage |
|-------------|------------|-------------|----------------|
| Basic TCP | Low | Poor | Minimal |
| Multi-threaded | Medium | Moderate | High |
| Thread Pool | High | Excellent | Controlled |

### Sample Results (1000 concurrent users)
- **Basic TCP:** ~100 req/sec, 15% errors
- **Multi-threaded:** ~500 req/sec, 2% errors  
- **Thread Pool:** ~800 req/sec, 0.1% errors

## 🔧 Requirements

- Java 17+
- Apache JMeter 5.4+

## 🛠 Key Learnings

- Socket and ServerSocket programming
- Thread management strategies
- Performance testing with JMeter
- Scalability trade-offs in server design

## 📄 License

MIT License - feel free to use and modify.

---

**⭐ Star this repo if it helped you learn Java socket programming!**