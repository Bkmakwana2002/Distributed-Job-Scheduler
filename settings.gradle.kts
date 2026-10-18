rootProject.name = "distributed-job-scheduler"

dependencyResolutionManagement {
    repositories { mavenCentral() }
}

include("core", "storage", "engine", "workflow", "server", "scheduler", "app", "cli")
