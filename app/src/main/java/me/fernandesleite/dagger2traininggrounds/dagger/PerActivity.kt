package me.fernandesleite.dagger2traininggrounds.dagger

import javax.inject.Scope

/**
 * Custom scopes: This is useful if we want to reuse single instances of dependencies
 * for example in an activity or fragment, but not keep them as application-wide singletons
 * that stay in memory for the whole lifetime of the app.
 * Create a custom annotation, with @Scope, @MustBeDocumented, @Retention and use it in conjunction
 * with a Dagger Component that lives as long as the scope (in this case ActivityComponent)
 *
 * If we want to create an application-wide singleton,
 * we have to instantiate its component (AppComponent) in the Application class (ExampleApp) and access it
 * from everywhere else through a call to getApplication (MainActivity).
 */

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity {
}