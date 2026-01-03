package drills.navigation

/**
 * A simple API client stub to use during navigation exercises.
 * The methods here do not perform real network requests; they are purely
 * placeholders so you can practise jumping between definitions, arguments
 * and return types.
 */
class ApiClient {

    fun fetchUser(userId: Int): User {
        // Pretend to fetch a user from a remote API
        val endpoint = "/users/$userId"
        return User(userId, "User$userId", endpoint)
    }

    fun updateUser(user: User): Boolean {
        // Simulate updating a user; always return true
        println("Updating user ${'$'}{user.id}")
        return true
    }

    fun deleteUser(userId: Int): Boolean {
        // Simulate deletion
        println("Deleting user ${'$'}userId")
        return true
    }
}

data class User(val id: Int, val name: String, val endpoint: String)