# Assignment 1 — Design Patterns

**IDE:** IntelliJ IDEA (Maven project)

This project implements:

- **Abstract Factory** — `SmartDeviceFactory` creates a family of products (Bulb, Lock) for a brand via `BrandAFactory` and `BrandBFactory`.
- **Factory Method** — each product defers usage-data loading via `createUsageLoader()` (implemented by concrete products), which returns a `UsageLoader` (here, `FileUsageLoader`) to read values from tiny text files (simulating an external DB).

## Repository Structure
```text
design-patterns-assignment-min/
├─ pom.xml
├─ README.md
├─ docs/
│  ├─ uml.txt
│  └─ uml.plantuml
└─ src/
   ├─ main/
   │  ├─ java/
   │  │  └─ com/aliza/smart/
   │  │     ├─ api/
   │  │     │  ├─ Bulb.java
   │  │     │  ├─ Lock.java
   │  │     │  └─ SmartDeviceFactory.java
   │  │     ├─ devices/
   │  │     │  ├─ AbstractSmartDevice.java
   │  │     │  ├─ BrandABulb.java
   │  │     │  ├─ BrandALock.java
   │  │     │  ├─ BrandBBulb.java
   │  │     │  └─ BrandBLock.java
   │  │     ├─ factories/
   │  │     │  ├─ BrandAFactory.java
   │  │     │  └─ BrandBFactory.java
   │  │     ├─ usage/
   │  │     │  ├─ UsageLoader.java
   │  │     │  └─ FileUsageLoader.java
   │  │     └─ app/
   │  │        └─ Main.java
   │  └─ resources/
   │     └─ usage/
   │        ├─ brandA/
   │        │  ├─ bulb.txt
   │        │  └─ lock.txt
   │        └─ brandB/
   │           ├─ bulb.txt
   │           └─ lock.txt
   └─ test/
      └─ java/
         └─ com/aliza/smart/
            └─ BulbLockTests.java
```

## How to Run (IntelliJ)
1. Open **File → New → Project from Existing Sources…**, choose `pom.xml`.
2. Wait for Maven sync.
3. Run demo: open `Main.java` → ▶.
4. Run tests: right-click `test/java/com/aliza/smart` → **Run ‘Tests…’**.

## Demo Output
- **Brand A Bulb** loads watts from `usage/brandA/bulb.txt`.
- **Brand B Lock** loads %/day from `usage/brandB/lock.txt`.

## Tests
- `loadsUsageForBrandABulb()` → expects `9.5`.
- `loadsUsageForBrandBLock()` → expects `0.20`.
- `factoriesCreateCorrectConcreteTypes()` → sanity check.

## Tests Explain: loadsUsageForBrandABulb()
This test checks that the BrandAFactory correctly creates a Bulb. After calling loadUsage(), the bulb should report a usage value of 9.5. This ensures the brand-specific implementation behaves as expected.

loadsUsageForBrandBLock()
This test verifies that the BrandBFactory correctly creates a Lock. After calling loadUsage(), the lock should report a usage value of 0.20. This validates that the Brand B lock implementation is working properly.

factoriesCreateCorrectConcreteTypes()
This is a sanity check to ensure that both factories (BrandAFactory and BrandBFactory) create non-null instances of both Bulb and Lock. This test confirms that the abstract factory design pattern is implemented correctly and consistently across brands.

## Screenshots
- `docs/screenshots/main-output.png` - please check this folder 
- `docs/screenshots/tests-pass.png` - please check this folder
- `docs/screenshots/uml.png` - please check this folder






