## BLE+UWB (3 months - 1 member)

The project was created from scratch. The codebase was initialized using Kotlin Multiplatform (KMP) for both Android and iOS.Project were defined with the MVI approach, focusing on the technical stack and its stability in multiple scenarios.

### Summary

Developed a Proof of Concept (POC) for ranging distance using Bluetooth Low Energy (BLE) and Ultra-Wideband (UWB) for secure access to homes, cars, and payment systems. Devices supporting BLE and UWB acted as peripherals, while the phone (Android with BLE and/or UWB support) served as the central device. The phone, running foreground service, attempted to determine its position using indoor algorithms based on BLE for coarse signals and UWB for finer signals. When certain conditions were met, it triggered a notification, vibration, or an API request.

### Tech Stack

- **Kotlin Multiplatform**, BLE, UWB, MVI, Jetpack Compose, Jetpack Navigation, Coroutine, Flow, Koin
- **JUnit**, MockWebServer, Espresso, AndroidJUnitRunner
- **Firebase Test Lab**, Firebase App Distribution, Triangulation (for indoor positioning)

### Unit Tests

1. **API (Retrofit)**:
   - API responses success, failure, timeout

### Instrumentation Tests

1. **Foreground service**:
   - Verify that the service is running in the foreground.
   - Check that the notification is displayed.
   - Ensure that the service remains active across various lifecycle events (e.g., configuration changes, app entering the background).

2. **Notification**:
   - Test that the notification appears with the correct content.
   - Test interactions with the notification (e.g., clicking, dismissing, or taking actions like replying to a message).

3. **BLE**:
   - Test scanning for BLE devices.
   - Check behavior when a BLE device disconnects or goes out of range.

4. **Permissions**:
   - Test the flow when permissions are granted.
   - Test how the app handles denied permissions.

5. **Doze Mode and App Standby**:
   - Verify that the service continues to run.
   - Ensure high-priority notifications are delivered.
   - Ensure BLE scanning or data exchange continues if the app is running in the foreground.
   - Test if Retrofit can run under Doze Mode when using foreground services.

---

## Mozanio (3 months)

**Team**: React Native (1 senior, 2 juniors), QA (2), Backend (1 senior, 1 junior)

### Summary

Developed and managed two apps using React Native and the Strapi framework: a user-facing coffee ordering app and a vendor app for coffee shop owners to manage their branches, staff, menu, materials, and revenue. Designed the wireframe and developed business logic. The project integrated AWS for cloud services, Elasticsearch for efficient search functionality, VNPay as the payment gateway, and SMS for OTP verification. The user app provides a seamless ordering experience, while the vendor app supports efficient business management for coffee shop operations.

### Tasks

- Developed main features and transferred knowledge to 2 fresher team members.
- Set up React Native codebase, linter, pre-commit, and SonarQube.
- Estimated timelines, ensured project quality, and reported progress.

---

## GEMMA (9 months)

**Team**: Android (1 senior, 2 juniors), iOS (1 senior, 1 junior), QA (2), Backend (1 senior, 1 junior)

### Methodology

Scrum

### Summary

Led the development and management of an MVP app that allows users to bookmark and share content via Sharesheet on Android, such as links, media, and images with friends. Users comment on shared content, facilitating discussions. The app functions as a social platform where users interact around interesting content.

### Tech Stack

- **MVVM + Clean Architecture**, Coroutine, Flow, Room, JUnit, MockWebServer, Mockk, Espresso, AndroidJUnitRunner, Firebase Test Lab, Firebase App Distribution, Retrofit, Hilt, Android Jetpack's Navigation Component, Firebase Crashlytics, LeakCanary.

### Tasks

- Set up the codebase, collaborated with Backend and QA teams, implemented features, and conducted code reviews.
- Set up CI/CD pipeline using GitLab.

### Project Structure

1. **Presentation Layer (UI & ViewModel)**:
   - ViewModel (MVVM pattern)
   - Activities or Fragments to handle UI
   - Jetpack Navigation Component for navigation
   - Flow for observing UI state

2. **Domain Layer (Use Cases & Entities)**:
   - **Use Cases**: Each use case is responsible for one specific piece of business logic (e.g., `CreateGemUseCase` for creating a new thread 'Gem').
   - **Repository**: Abstraction of the data source, on which use cases depend.
   - **Entities**: Core business models representing the data.

3. **Data Layer (Repositories, Room, Retrofit)**:
   - **RepositoryImpl**: An implementation of the Repository, dependent on the abstract data source.
   - **DataSource**: Data source abstraction.
   - **LocalDatasource**: Implementation of a data source, typically using Room.
   - **RemoteDataSource**: Implementation of a data source, typically using Retrofit.

4. **External Layers**:
   - **Firebase Crashlytics** for error reporting.
   - **Firebase Test Lab** for cloud-based testing.
   - **LeakCanary** for memory leak detection.
   - **Hilt** for dependency injection.
   - Utility classes for mapping DTOs to entities and vice versa.

### Unit Tests

- Ensure the local-first, remote fallback strategy for the repository.
- Ensure ViewModel state updates correctly (loading, success, error).
- Use an in-memory Room database to test the insertion and deletion of a Gem.

### Integration Tests

- Test interactions between Repository and ViewModel.
- Test interactions between Room, Retrofit, and ViewModel.

### Instrumentation Tests

- Test notification display and interaction.
- Test Sharesheet content and user interaction.
- Ensure deep link navigation and data handling.

---

## Bobidi (1 year)

**Team**: Android (1), iOS (1), QA (2), Backend (1)

### Methodology

Scrum

### Summary

Developed an Android app to filter and enhance the quality of test/training data for AI models. The app enabled users to classify, detect, and train AI models defined by customers. Users earned rewards in cash or credit based on their contributions.

### Tech Stack

- **MVP - MVVM + Clean Architecture**, Coroutine, Room, Flow, JUnit, MockWebServer, Espresso, AndroidJUnitRunner, Firebase App Distribution, Retrofit, Dagger/Hilt, Android Jetpack's Navigation Component, WorkManager, Firebase, Firebase Crashlytics, LeakCanary, TensorFlow Lite.

### Tasks

- Refactored codebase from MVP to MVVM + Clean Architecture.
- Fixed remaining issues.
- Used WorkManager for downloading multiple models, validating the models, submitting results, and earning rewards.

### Unit Tests

- Test API requests and responses.
- Test Room database CRUD operations.

### Integration Tests

- Test Repository + ViewModel interactions.
- Test local + remote data flow.
- Test download tasks with WorkManager to ensure completion.

### Instrumentation Tests

- Test notification display and interaction.
- Test navigation triggered by notification.
- Test camera and microphone permissions.

---

## Quickom (1 year)

**Team**: Android (3), iOS (2), Backend (3), QA (2)

### Summary

Built a WebRTC-based peer-to-peer video conference application from scratch. Integrated blockchain functionality, allowing the host to receive rewards through transactions conducted during the conference. The platform provided secure and transparent transactions, enhancing user experience and reward distribution.

### Tech Stack

- **MVVM**, RxJava, SQLite, Retrofit, Dagger, Firebase, WebRTC, WebSocket, XMPP.

### Tasks

- Researched WebRTC implementation.
- Implemented UI/UX.
- Collaborated with Backend and QA teams to keep the project on track.
- Transferred knowledge and tasks to 2 junior Android developers.
- Refactored code to align with business logic.
