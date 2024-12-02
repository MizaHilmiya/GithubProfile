package id.ac.polbeng.mizahilmiya.githubprofile.models

import com.google.gson.annotations.SerializedName

data class GithubUser(

    @field:SerializedName("bio")
    val bio: String,

    @field:SerializedName("created_at")
    val createdAt: String,

    @field:SerializedName("blog")
    val blog: String,

    @field:SerializedName("public_gists")
    val publicGists: Int,

    @field:SerializedName("url")
    val url: String,

    @field:SerializedName("followers")
    val followers: Int,

    @field:SerializedName("avatar_url")
    val avatarUrl: String,

    @field:SerializedName("html_url")
    val htmlUrl: String,

    @field:SerializedName("following")
    val following: Int,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("company")
    val company: String,

    @field:SerializedName("location")
    val location: Any,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("public_repos")
    val publicRepos: Int,

    @field:SerializedName("email")
    val email: Any
)

